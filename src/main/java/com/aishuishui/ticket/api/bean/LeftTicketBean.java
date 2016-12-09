package com.aishuishui.ticket.api.bean;

import java.util.List;

public class LeftTicketBean {
	private boolean status;
	private int httpstatus;
	private LeftTicketDataBean data;
	private List<String> messages;
	private ValidateMessageBean validateMessages;
	private String validateMessagesShowId;

	public LeftTicketBean() {
		super();
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getHttpstatus() {
		return httpstatus;
	}

	public void setHttpstatus(int httpstatus) {
		this.httpstatus = httpstatus;
	}

	public LeftTicketDataBean getData() {
		return data;
	}

	public void setData(LeftTicketDataBean data) {
		this.data = data;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public ValidateMessageBean getValidateMessages() {
		return validateMessages;
	}

	public void setValidateMessages(ValidateMessageBean validateMessages) {
		this.validateMessages = validateMessages;
	}

	public String getValidateMessagesShowId() {
		return validateMessagesShowId;
	}

	public void setValidateMessagesShowId(String validateMessagesShowId) {
		this.validateMessagesShowId = validateMessagesShowId;
	}

}
