package com.online.service;

import com.online.model.User;

public interface UserService {
	
	public User findUserByEmail(String email);
	
	public void saveUser(User user);
}