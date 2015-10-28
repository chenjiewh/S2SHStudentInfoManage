package com.java1234.dao;

import com.java1234.model.User;

//这是一个接口
public interface UserDao {

	public User login(User user) throws Exception;
}
