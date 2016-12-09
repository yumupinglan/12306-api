package com.aishuishui.ticket.api.response;

import com.aishuishui.ticket.TicketApiResponse;

public abstract class ApiBaseResponse {

	protected TicketApiResponse resp;

	public ApiBaseResponse(TicketApiResponse resp) {
		super();
		this.resp = resp;
	}

	public String getCookie() {
		return this.resp.getCookies()[0].getValue();
	}

	public TicketApiResponse getResp() {
		return resp;
	}

	public void setResp(TicketApiResponse resp) {
		this.resp = resp;
	}

}
