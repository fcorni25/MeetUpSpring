package com.decathlon.MeetUpSpring.controller;

import java.util.List;


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
import com.decathlon.MeetUpSpring.models.User;
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
		public EventDTO addNewEvent(@RequestBody EventDTO eventDTO) throws Exception {
		
		 Event tmpEvent =eventService.create(convertToEvent(eventDTO));
		 return convertToEventDto(tmpEvent);
		};
	
		
	@GetMapping("/events")
		public List<Event> getEvents() {
			return eventService.getEvents();
	}
	
		
		private EventDTO convertToEventDto(Event event) {
			EventDTO eventMapDTO = eventMapper.map(event, EventDTO.class);
			eventMapDTO.setOwner_id(event.getOwner().getId());
			return eventMapDTO;
		  }

		  private Event convertToEvent(EventDTO eventDTO) {
		  Event eventMap = eventMapper.map(eventDTO, Event.class);
		  User user = new User();
		  user.setId(eventDTO.getOwner_id());
		  eventMap.setOwner(user);
		  return eventMap;
		  }
	
		
}
