package com.example.car.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ApplicationExceptionHandler {

	@ExceptionHandler(DataNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public @ResponseBody ExceptionResponse handleDataNotFoundException(DataNotFoundException exception,final HttpServletRequest request) {
		System.out.println("ApplicationExceptionHandler.handleDataNotFoundException()");
		ExceptionResponse error= new ExceptionResponse();
		error.setErrorMessage(exception.getMessage());
		error.setUrl(request.getRequestURI());
		return error;
	}
	

	
	
	
	
	
}
