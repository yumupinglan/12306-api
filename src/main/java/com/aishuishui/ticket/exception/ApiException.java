package com.aishuishui.ticket.exception;

public class ApiException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3899956357577372654L;

	public ApiException(String message) {
		super(message);
	}

	public ApiException(Exception ex) {
		super(ex);
	}

	public ApiException(String message, Exception ex) {
		super(message, ex);
	}
}
