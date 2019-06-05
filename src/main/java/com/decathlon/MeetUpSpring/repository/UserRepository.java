package com.decathlon.MeetUpSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.decathlon.MeetUpSpring.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
