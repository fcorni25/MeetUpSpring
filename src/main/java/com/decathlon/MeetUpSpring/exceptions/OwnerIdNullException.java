package com.decathlon.MeetUpSpring.exceptions;


public class OwnerIdNullException extends Exception {
	
	public OwnerIdNullException() {
		super("Owner id doesn't exist");
	}
	
}
