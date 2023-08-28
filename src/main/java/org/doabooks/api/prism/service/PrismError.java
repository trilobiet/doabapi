package org.doabooks.api.prism.service;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PrismError {
	
	private final int code;
	private final String message;
	
	public PrismError(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	@JsonProperty("code")
	public int getCode() {
		return code;
	}

	@JsonProperty("error")
	public String getMessage() {
		return message;
	}

}
