package com.decathlon.MeetUpSpring.dto;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import com.decathlon.MeetUpSpring.models.User;

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
	@NotNull(message = "Owner must not be null")
	private Long owner_id;
	private String location;
}
