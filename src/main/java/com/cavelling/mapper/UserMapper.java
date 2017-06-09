package com.cavelling.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.cavelling.model.User;

@Mapper
public interface UserMapper {
	
	User findByUsername(String username);
}
