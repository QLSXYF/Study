package com.example.mybatis.service;

import com.example.mybatis.model.User;
import com.example.mybatis.model.UserResponse;

/**
 *
 * @author Eva
 * @date 2018年5月14日
 *
 */
public interface UserService {

	UserResponse add(User user);
	User findById(int id);
	User findByName(String name);

}

		