package com.decathlon.MeetUpSpring.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity // Pour indiquer que l'entité doit ^tre enregistree en bdd
public class Event {
	
	@Id
	@GeneratedValue // si on utilise une sequence (strategy=GenerationType.SEQUENCE, generator="EnventSeq")
	private Long id;
	private String name;
	private LocalDateTime begin_date;
	private LocalDateTime end_date;
	private int attendees_limit;
	private int attendees_number;
	private String event_description;
	@ManyToOne
	@JoinColumn(name = "owner_id")
	@NotNull(message = "Owner must not be null")
	private User owner;
	private String location;
}
