package com.batchprocess.response;

import java.io.Serializable;

import org.json.JSONObject;

public class ResponseElementWrapper implements Serializable {
	private static final long serialVersionUID = -2198093000844668501L;
	
	private String responseCode;
	private String responseMessage;
	private String responseData;
	
	public ResponseElementWrapper(String responseCode, String responseMessage, String responseData) {
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
		this.responseData = responseData;
	}
	
	public ResponseElementWrapper() {
	}

	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public String getResponseData() {
		return responseData;
	}
	public void setResponseData(String responseData) {
		this.responseData = responseData;
	}
	
}
