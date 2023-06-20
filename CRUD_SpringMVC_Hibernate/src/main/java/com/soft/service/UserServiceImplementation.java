package com.soft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.soft.DAO.UserDAO;
import com.soft.entity.User;

@Component
public class UserServiceImplementation implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public int saveUserService(User user) {
		
		return userDAO.saveUserDAO(user);
	}
	
	@Override
	public List<User> getAlluserService(){
		
		return userDAO.getAlluserService();
	}
	
	public void deleteByIdService(int Id) {
		
		userDAO.deleteByIdDAO(Id);
	}
	
	public User getuserByIdService(int userId) {
		return userDAO.getByIdDAO(userId);
	}

	
	public void UpdateExistUserService(User user) {
		userDAO.updateUserDAO(user);
	}
}
