package com.aishuishui.ticket;

import org.apache.http.Header;

public class TicketApiResponse {
	private String content;
	private Header[] cookies;

	public TicketApiResponse(String content, Header[] cookies) {
		super();
		this.content = content;
		this.cookies = cookies;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Header[] getCookies() {
		return cookies;
	}

	public void setCookies(Header[] cookies) {
		this.cookies = cookies;
	}

}
