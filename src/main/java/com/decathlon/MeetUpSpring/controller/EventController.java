package com.decathlon.MeetUpSpring.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.decathlon.MeetUpSpring.dto.EventDTO;
import com.decathlon.MeetUpSpring.models.Event;
import com.decathlon.MeetUpSpring.service.EventService;

@RestController
public class EventController {

	private EventService eventService;
	private ModelMapper eventMapper;
	
	// pour eviter @Autowired
	public EventController(EventService eventService, ModelMapper eventMapper) {
		this.eventService = eventService;
		this.eventMapper = eventMapper;
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
	
		
//	@GetMapping("/events")
//		public
	
		
		private EventDTO convertToEventDto(Event event) {
		    return eventMapper.map(event, EventDTO.class);
		  }

		  private Event convertToEvent(EventDTO eventDTO) {
		    return eventMapper.map(eventDTO, Event.class);
		  }
	
		
}
