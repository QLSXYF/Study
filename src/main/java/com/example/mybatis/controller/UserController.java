package com.example.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mybatis.model.User;
import com.example.mybatis.model.UserResponse;
import com.example.mybatis.service.UserService;

/**
 *
 * @author Eva
 * @date 2018年5月14日
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("add")
	@ResponseBody
	public UserResponse add(User user) {
		if(userService.findByName(user.getName()) != null){
            return UserResponse.fail("TEST-001", "用户名已被使用");
		}
		
		return userService.add(user);
	}
}

		