package com.sprintBoot.tutorial.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TutorialNotFoundException extends RuntimeException {

	public TutorialNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
		
		
	}

}
