package com.decathlon.MeetUpSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.decathlon.MeetUpSpring.dto.EventDTO;
import com.decathlon.MeetUpSpring.service.EventService;

@RestController
public class EventController {

	private EventService eventService;
	
	// pour eviter @Autowired
	public EventController(EventService eventService) {
		this.eventService = eventService;
	}

	@GetMapping("/ping")
		public String pong() {
			return "pong";
	}

	@PostMapping("/events") 
	@ResponseStatus(HttpStatus.CREATED) // 201
		public EventDTO addNewEvent(@RequestBody EventDTO eventDTO) {
			return eventService.create(eventDTO);
		};
		
		
}
