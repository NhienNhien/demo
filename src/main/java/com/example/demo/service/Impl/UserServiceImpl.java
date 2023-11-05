package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import com.example.demo.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	
	
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}



//	@Override
//	public User save(User user) {
//		// TODO Auto-generated method stub
//		return userRepository.save(user);
//	}



//	@Override
//	public User save(UserRegistrationDto registrationDto) {
//		// TODO Auto-generated method stub
//		User user = new User(registrationDto.getAddress(), registrationDto.getDob(), registrationDto.getEmail(), registrationDto.getFullname(), registrationDto.getPassword(), registrationDto.getPhone(), 0, registrationDto.getUsername());
//		return userRepository.save(user);
//	}



	@Override
	public User save(UserRegistrationDto registrationDto) {
		// TODO Auto-generated method stub
		User user = new User(registrationDto.getAddress(), registrationDto.getDob(), registrationDto.getEmail(), registrationDto.getFullname(), registrationDto.getPassword(), registrationDto.getPhone(), 0, registrationDto.getUsername());
		return userRepository.save(user);
	}



	

}
