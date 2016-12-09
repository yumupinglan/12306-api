package com.aishuishui.ticket.api.request;

import java.util.ArrayList;
import java.util.List;

import com.aishuishui.ticket.TicketApiRequest;
import com.aishuishui.ticket.api.bean.QueryParam;
import com.aishuishui.ticket.exception.ApiException;

public class TicketRequest extends ApiBaseRequest {
	/**
	 * 查询余票
	 * 
	 * @param yyyyMMdd
	 * @param from
	 * @param to
	 * @return
	 * @throws ApiException
	 */
	public static TicketApiRequest queryLeftTicket(String yyyyMMdd, String from, String to) throws ApiException {
		List<QueryParam> parameters = new ArrayList<QueryParam>();
		addParameterSafely(parameters, "purpose_codes", "ADULT", false);
		addParameterSafely(parameters, "queryDate", yyyyMMdd, false);
		addParameterSafely(parameters, "from_station", from, false);
		addParameterSafely(parameters, "to_station", to, false);
		return (new TicketApiRequest("/otn/lcxxcx/query", METHOD_GET, parameters));
	}
}
