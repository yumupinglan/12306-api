package com.aishuishui.ticket.api.request;

import java.util.ArrayList;
import java.util.List;

import com.aishuishui.ticket.TicketApiRequest;
import com.aishuishui.ticket.api.bean.QueryParam;
import com.aishuishui.ticket.exception.ApiException;

public class LoginRequest extends ApiBaseRequest {
	/**
	 * 获取cookie
	 * 
	 * @return
	 */
	public static TicketApiRequest obtainCookie() {
		List<QueryParam> parameters = new ArrayList<QueryParam>();
		return (new TicketApiRequest("/otn/login/init", METHOD_GET, parameters));
	}

	/**
	 * 获取验证码
	 * 
	 * @return
	 */
	public static TicketApiRequest getRandCode() {
		List<QueryParam> parameters = new ArrayList<QueryParam>();
		return (new TicketApiRequest("/otn/passcodeNew/getPassCodeNew?module=login&rand=sjrand", METHOD_GET, parameters));
	}

	/**
	 * 验证校验码
	 * 
	 * @param randCode
	 * @return
	 * @throws ApiException
	 */
	public static TicketApiRequest checkRandCodeAnsyn(String randCode) throws ApiException {
		List<QueryParam> parameters = new ArrayList<QueryParam>();
		addParameterSafely(parameters, "rand", "sjrand", false);
		addParameterSafely(parameters, "randCode", randCode, false);
		return (new TicketApiRequest("/otn/passcodeNew/checkRandCodeAnsyn", METHOD_POST, parameters));
	}

	/**
	 * 登录尝试
	 * 
	 * @param username
	 * @param password
	 * @param randCode
	 * @return
	 * @throws ApiException
	 */
	public static TicketApiRequest loginAysnSuggest(String username, String password, String randCode) throws ApiException {
		List<QueryParam> parameters = new ArrayList<QueryParam>();
		addParameterSafely(parameters, "loginUserDTO.user_name", username, false);
		addParameterSafely(parameters, "userDTO.password", password, false);
		addParameterSafely(parameters, "randCode", randCode, false);
		return (new TicketApiRequest("/otn/login/loginAysnSuggest", METHOD_POST, parameters));
	}

}
