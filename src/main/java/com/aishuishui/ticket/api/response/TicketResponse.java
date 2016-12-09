package com.aishuishui.ticket.api.response;

import com.aishuishui.ticket.TicketApiResponse;
import com.aishuishui.ticket.api.bean.LeftTicketBean;
import com.alibaba.fastjson.JSON;

public class TicketResponse extends ApiBaseResponse {

	public TicketResponse(TicketApiResponse resp) {
		super(resp);
	}

	public LeftTicketBean getLeftTicket() {
		return JSON.parseObject(this.resp.getContent(), LeftTicketBean.class);
	}
}
