package com.java1234.service;

import com.java1234.model.User;

//事务层，比如调用一些dao
public interface UserService {
	
	public User login(User user) throws Exception;
}
