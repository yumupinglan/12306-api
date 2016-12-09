package com.aishuishui.ticket;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aishuishui.ticket.api.bean.LeftTicketBean;
import com.aishuishui.ticket.api.bean.LoginAysnSuggestBean;
import com.aishuishui.ticket.api.bean.QueryParam;
import com.aishuishui.ticket.api.helper.SSLClient;
import com.aishuishui.ticket.api.request.LoginRequest;
import com.aishuishui.ticket.api.request.TicketRequest;
import com.aishuishui.ticket.api.response.LoginResponse;
import com.aishuishui.ticket.api.response.TicketResponse;
import com.aishuishui.ticket.exception.ApiException;
import com.alibaba.fastjson.JSONException;

public class TicketApi {
	private static final Logger LOGGER = LoggerFactory.getLogger(TicketApi.class);
	private CloseableHttpClient closeableHttpClient = null;
	private String API_ENDPOINT = "https://kyfw.12306.cn/";
	private String cookie;
	private boolean debug;

	public TicketApi(String cookie, boolean debug) {
		try {
			this.closeableHttpClient = new SSLClient();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.cookie = cookie;
		this.debug = debug;
	}

	public TicketApiResponse execute(TicketApiRequest req) throws ApiException {
		try {
			TicketApiResponse response = null;
			if ("GET".equals(req.getMethod())) {
				StringBuffer queryUrl = new StringBuffer();
				queryUrl.append(API_ENDPOINT).append(req.getAction()).append("?");
				for (QueryParam param : req.getParameters()) {
					queryUrl.append(param.getKey()).append("=").append(param.getValue()).append("&");
				}
				HttpGet httpGet = new HttpGet(queryUrl.substring(0, queryUrl.length() - 1));
				response = callGetApi(req.getAction(), httpGet);
			} else {
				HttpPost httpPost = new HttpPost(API_ENDPOINT + req.getAction());
				response = callPostApi(req.getAction(), httpPost, req.getParameters());
			}
			return response;
		} catch (JSONException ex) {
			throw new ApiException(ex);
		}
	}

	private TicketApiResponse callPostApi(String action, HttpPost httpPost, List<QueryParam> parameters) throws ApiException {
		try {
			if (this.cookie != null)
				httpPost.addHeader("Cookie", this.cookie);

			ArrayList<NameValuePair> postParameters = new ArrayList<NameValuePair>();
			for (QueryParam param : parameters) {
				postParameters.add(new BasicNameValuePair(param.getKey(), param.getValue()));
			}
			httpPost.setEntity(new UrlEncodedFormEntity(postParameters));

			CloseableHttpResponse httpResponse = closeableHttpClient.execute(httpPost);
			int statusCode = httpResponse.getStatusLine().getStatusCode();
			Header[] cookies = httpResponse.getHeaders("Set-Cookie");
			throwIfUnsuccessful(action, statusCode);

			String response = null;
			try {
				response = EntityUtils.toString(httpResponse.getEntity());
			} catch (ParseException | IOException ex) {
				throw new ApiException(ex);
			}

			if (debug) {
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug("Response for end point '{}', with action '{}': {}", API_ENDPOINT, action, response);
				}
			}
			return (new TicketApiResponse(response, cookies));

		} catch (IOException ex) {
			throw (new ApiException(ex));
		}
	}

	private TicketApiResponse callGetApi(String action, HttpGet httpGet) throws ApiException {
		try {
			if (this.cookie != null)
				httpGet.addHeader("Cookie", this.cookie);

			CloseableHttpResponse httpResponse = closeableHttpClient.execute(httpGet);
			int statusCode = httpResponse.getStatusLine().getStatusCode();
			Header[] cookies = httpResponse.getHeaders("Set-Cookie");
			throwIfUnsuccessful(action, statusCode);

			String response = null;
			try {
				response = EntityUtils.toString(httpResponse.getEntity());
			} catch (ParseException | IOException ex) {
				throw new ApiException(ex);
			}

			if (debug) {
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug("Response for end point '{}', with action '{}': {}", API_ENDPOINT, action, response);
				}
			}
			return (new TicketApiResponse(response, cookies));

		} catch (IOException ex) {
			throw (new ApiException(ex));
		}
	}

	private void throwIfUnsuccessful(String action, int statusCode) throws ApiException {
		if (statusCode != HttpStatus.SC_OK) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("Non-200 HTTP Status code returned:");
			stringBuilder.append(statusCode);
			stringBuilder.append(" for action '");
			stringBuilder.append(action);
			stringBuilder.append("'.");
			throw new ApiException(stringBuilder.toString());
		}
	}

	public String obtainCookie() throws ApiException {
		return new LoginResponse(execute(LoginRequest.obtainCookie())).getCookie();
	}

	public LoginAysnSuggestBean loginAysnSuggest(String username, String password, String randCode) throws ApiException {
		return new LoginResponse(execute(LoginRequest.loginAysnSuggest(username, password, randCode))).getLoginAysnSuggest();
	}

	public LeftTicketBean queryLeftTicket(String yyyyMMdd, String from, String to) throws ApiException {
		return new TicketResponse(execute(TicketRequest.queryLeftTicket(yyyyMMdd, from, to))).getLeftTicket();
	}
}
