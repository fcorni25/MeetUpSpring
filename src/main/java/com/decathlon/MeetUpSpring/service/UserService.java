package com.decathlon.MeetUpSpring.service;

import org.springframework.stereotype.Service;

import com.decathlon.MeetUpSpring.models.User;
import com.decathlon.MeetUpSpring.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {

	private UserRepository userRepository;
	
	public User create(User user) {
		
		
		return userRepository.save(user);
	}

}
