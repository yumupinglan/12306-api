package com.aishuishui.ticket.api.bean;

import java.util.List;

public class LoginAysnSuggestBean {
	private boolean status;
	private int httpstatus;
	private LoginAysnSuggestDataBean data;
	private List<String> messages;
	private ValidateMessageBean validateMessages;
	private String validateMessagesShowId;

	public LoginAysnSuggestBean() {
		super();
	}

	public String getValidateMessagesShowId() {
		return validateMessagesShowId;
	}

	public void setValidateMessagesShowId(String validateMessagesShowId) {
		this.validateMessagesShowId = validateMessagesShowId;
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

	public LoginAysnSuggestDataBean getData() {
		return data;
	}

	public void setData(LoginAysnSuggestDataBean data) {
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

}
