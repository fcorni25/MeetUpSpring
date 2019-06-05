package com.decathlon.MeetUpSpring.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity // Pour indiquer que l'entité doit ^tre enregistree en bdd
public class Event {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EnventSeq")
	private Long id;
	private String name;
	private LocalDateTime begin_date;
	private LocalDateTime end_date;
	private int attendees_limit;
	private int attendees_number;
	private String event_description;
	private String owner;
	private String location;
}
