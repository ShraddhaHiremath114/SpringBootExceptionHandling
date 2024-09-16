package com.springbootexception.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@ControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value=Exception.class)
	public String handleGlobalExc(Exception e) {
		return "error";
	}
}
