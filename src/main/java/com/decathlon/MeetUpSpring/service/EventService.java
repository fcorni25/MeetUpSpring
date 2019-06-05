package com.decathlon.MeetUpSpring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.decathlon.MeetUpSpring.dto.EventDTO;
import com.decathlon.MeetUpSpring.exceptions.OwnerIdNullException;
import com.decathlon.MeetUpSpring.models.Event;
import com.decathlon.MeetUpSpring.repository.EventRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor // pour générer le constructeur à la place de @Autowired
public class EventService {
	
	private EventRepository eventRepository;


	public Event create(Event event) throws OwnerIdNullException {
		
		// récupérer le owner du formulaire
		// vérifier existance dans la bdd
		
		 if ( event.getOwner().getId() == null) {
			 throw new OwnerIdNullException();
	
		 }
		 
		 
		
		// s'il n'existe pas on le crée
		// sinon on save
		
		return eventRepository.save(event);
	}

	public List<Event> getEvents() {
		// TODO Auto-generated method stub
		return eventRepository.findAll();
	}
	
	

//	public EventDTO create(EventDTO eventDTO) {
//		Event eventAItnitier = eventConverterDtoToModel(eventDTO);
//		Event save = eventRepository.save(eventAItnitier);
//		return eventConverterModelToDTO(save);
//	}
	
//	private Event eventConverterDtoToModel(EventDTO eventDTO) {
//		
//		Event event = new Event();
//		event.setName(eventDTO.getName());
//		event.setAttendees_limit(eventDTO.getAttendees_limit());
//		event.setAttendees_number(eventDTO.getAttendees_number());
//		event.setBegin_date(eventDTO.getBegin_date());
//		event.setEnd_date(eventDTO.getEnd_date());
//		event.setEvent_description(eventDTO.getEvent_description());
//		event.setLocation(eventDTO.getLocation());
//		event.setOwner(eventDTO.getOwner());
//		return event;
//	}
	
//	private EventDTO eventConverterModelToDTO(Event event) {
//		
//		EventDTO eventDTO = new EventDTO();
//		eventDTO.setId(event.getId());
//		eventDTO.setName(event.getName());
//		eventDTO.setAttendees_limit(event.getAttendees_limit());
//		eventDTO.setAttendees_number(event.getAttendees_number());
//		eventDTO.setBegin_date(event.getBegin_date());
//		eventDTO.setEnd_date(event.getEnd_date());
//		eventDTO.setEvent_description(event.getEvent_description());
//		eventDTO.setLocation(event.getLocation());
//		eventDTO.setOwner(event.getOwner());
//		return eventDTO;
//	}
	}
	
