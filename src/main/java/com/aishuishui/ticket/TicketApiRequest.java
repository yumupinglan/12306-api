package com.aishuishui.ticket;

import java.util.List;

import com.aishuishui.ticket.api.bean.QueryParam;

public class TicketApiRequest {
	private String action;
	private String method;
	private List<QueryParam> parameters;

	public TicketApiRequest() {
		super();
	}

	public TicketApiRequest(String action, String method, List<QueryParam> parameters) {
		super();
		this.action = action;
		this.method = method;
		this.parameters = parameters;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public List<QueryParam> getParameters() {
		return parameters;
	}

	public void setParameters(List<QueryParam> parameters) {
		this.parameters = parameters;
	}

}
