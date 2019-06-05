package com.decathlon.MeetUpSpring.controller;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.decathlon.MeetUpSpring.dto.EventDTO;
import com.decathlon.MeetUpSpring.dto.UserDTO;
import com.decathlon.MeetUpSpring.models.Event;
import com.decathlon.MeetUpSpring.models.User;
import com.decathlon.MeetUpSpring.service.EventService;
import com.decathlon.MeetUpSpring.service.UserService;

@RestController
public class UserController {

	private UserService userService;
	private ModelMapper userMapper;

	public UserController(UserService userService, ModelMapper userMapper) {
		this.userService = userService;
		this.userMapper = userMapper;
	}

	@PostMapping("/users")
	@ResponseStatus(HttpStatus.CREATED) // 201
	public UserDTO addNewUser(@RequestBody UserDTO userDTO) throws Exception {

		User tmpUser = userService.create(convertToUser(userDTO));
		return convertToUserDto(tmpUser);
	};

	private User convertToUser(UserDTO userDTO) {
		return userMapper.map(userDTO, User.class);
	}

	private UserDTO convertToUserDto(User user) {
		return userMapper.map(user, UserDTO.class);
	}

}
