package com.example.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.mybatis.model.User;

/**
 *
 * @author Eva
 * @date 2018年5月14日
 *
 */
@Mapper
public interface UserMapper {

    int add(User user);
    User findOne(User user);
}

		