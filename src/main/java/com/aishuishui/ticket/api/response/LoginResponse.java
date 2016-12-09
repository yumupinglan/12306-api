package com.aishuishui.ticket.api.response;

import com.aishuishui.ticket.TicketApiResponse;
import com.aishuishui.ticket.api.bean.LoginAysnSuggestBean;
import com.alibaba.fastjson.JSON;

public class LoginResponse extends ApiBaseResponse {

	public LoginResponse(TicketApiResponse resp) {
		super(resp);
	}

	public LoginAysnSuggestBean getLoginAysnSuggest() {
		return JSON.parseObject(this.resp.getContent(), LoginAysnSuggestBean.class);
	}
}
