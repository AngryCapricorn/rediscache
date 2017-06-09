package com.cavelling.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.cavelling.mapper.UserMapper;
import com.cavelling.model.User;

@RestController
public class TestHandler {
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/userinfo")
	public String getUserinfo(){
		User user = userMapper.findByUsername("admin");
		return JSON.toJSONString(user);
	}
}
