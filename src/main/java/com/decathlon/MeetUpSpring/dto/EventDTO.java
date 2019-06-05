package com.decathlon.MeetUpSpring.dto;

import java.sql.Date;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class EventDTO {

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
