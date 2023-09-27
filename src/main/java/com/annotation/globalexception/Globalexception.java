package com.annotation.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.annotation.exception.Excetion;

@RestControllerAdvice
public class Globalexception {

	
	@ExceptionHandler(Excetion.class)
	public ResponseEntity<Object> handle(Excetion e) {
		return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
}
}
