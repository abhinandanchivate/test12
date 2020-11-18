package com.tcs.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.auth.model.User;
import com.tcs.auth.repository.RoleRepository;
import com.tcs.auth.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;
	@Override
	public String registerUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
