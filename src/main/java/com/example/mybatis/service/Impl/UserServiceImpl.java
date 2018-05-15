package com.example.mybatis.service.Impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mybatis.mapper.UserMapper;
import com.example.mybatis.model.User;
import com.example.mybatis.model.UserResponse;
import com.example.mybatis.service.UserService;

/**
 *
 * @author Eva
 * @date 2018年5月14日
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
//	@Autowired
//    public UserServiceImpl(UserMapper userMapper) {
//        this.userMapper = userMapper;
//	}
	
	public UserResponse add(User user) {
		user.setCreateTime(new Date());
        userMapper.add(user);
        User u = findById(user.getId());
        return UserResponse.success(u);
    }
	
	public User findById(int id) {
        User user = new User();
        user.setId(id);
        return userMapper.findOne(user);
    }
	
	@Override
	public User findByName(String name) {
		 User param = new User(name);
	     return userMapper.findOne(param);
	}

}

		