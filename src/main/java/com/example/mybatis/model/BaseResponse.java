package com.example.mybatis.model;

/**
 *
 * @author Eva
 * @date 2018年5月14日
 *
 */
public class BaseResponse<T> {

	private String code;
	private String message;
	private T responseBody;
	public BaseResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BaseResponse(String code, String message, T responseBody) {
		super();
		this.code = code;
		this.message = message;
		this.responseBody = responseBody;
	}
	
	public BaseResponse(T responseBody) {
		super();
		this.responseBody = responseBody;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getResponseBody() {
		return responseBody;
	}
	public void setResponseBody(T responseBody) {
		this.responseBody = responseBody;
	}
	
}

		