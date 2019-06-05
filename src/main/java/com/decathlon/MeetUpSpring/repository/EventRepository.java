package com.decathlon.MeetUpSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.decathlon.MeetUpSpring.models.Event;


public interface EventRepository extends JpaRepository<Event, Long> {

	
}
