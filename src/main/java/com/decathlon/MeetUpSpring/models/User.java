package com.decathlon.MeetUpSpring.models;

import javax.persistence.GeneratedValue;
import javax.persistence.*;

import lombok.Builder;
import lombok.Data;

@Data
@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;
	private String name;

}
