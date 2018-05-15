package com.example.mybatis.model;

/**
 *
 * @author Eva
 * @date 2018年5月14日
 *
 */
public class UserResponse extends BaseResponse<User> {
	

	public static UserResponse success(User u) {
		UserResponse userResponse = new UserResponse();
		userResponse.setCode("200");
		userResponse.setMessage("success");
		userResponse.setResponseBody(u);
		return userResponse;
	}
	
	public static UserResponse fail(String code,String message) {
		UserResponse userResponse = new UserResponse();
		userResponse.setCode(code);
		userResponse.setMessage(message);
		return userResponse;
	}
	
}

		