package com.java.mvc.operations.SpringMVC.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandlerManager {
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus
	public ModelAndView exceptionPage(Exception e) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("error", e.toString());
		modelAndView.setViewName("errorHandlerPage");
		return modelAndView;
	}

}
