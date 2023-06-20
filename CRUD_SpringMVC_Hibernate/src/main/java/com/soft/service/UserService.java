package com.soft.service;

import java.util.List;

import com.soft.entity.User;

public interface UserService {
	
	public int saveUserService(User user);
	
	public List<User> getAlluserService();
	
	public void deleteByIdService(int Id);
	
	public User getuserByIdService(int userId);
	
	public void UpdateExistUserService(User user);

}
