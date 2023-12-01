package com.example.demo.service;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Entity.User;
import com.example.demo.Repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo repo;
	
	@Override
	public void registerUser(User user) {
		
		
		repo.save(user);
		

		
	}

}
