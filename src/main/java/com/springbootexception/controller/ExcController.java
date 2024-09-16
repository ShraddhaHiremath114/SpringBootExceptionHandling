package com.springbootexception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExcController {

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/exc1")
	public void exc1() {
		int a=10/0;
		System.out.println(a);
	}
	
//	@ExceptionHandler(value=ArithmeticException.class)
//	public String localExcHandler(ArithmeticException ae) {
//		return "error";
//	}
	
	@GetMapping("/exc2")
	public void exc2() {
		String str=null;
		System.out.println(str.length());
	}
	
//	@ExceptionHandler(value=Exception.class)
//	public String allLocalExc(Exception e) {
//		return "error";
//	}
}
