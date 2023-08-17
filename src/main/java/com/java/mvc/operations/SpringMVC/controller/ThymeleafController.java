package com.java.mvc.operations.SpringMVC.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class ThymeleafController {
		private static ModelAndView modelAndView = new ModelAndView() ;
	
		@GetMapping(value = "/loop")
	  public ModelAndView thymeleafLoops() {  
		  List<String> namesList = List.of("Manaan", "Bhat", "Azam", "Bhat");
		  modelAndView.addObject("namesList", namesList);
		  modelAndView.setViewName("thymleaf-form1"); 
		  return modelAndView;
	   
	  }
		
	 
	
		@GetMapping(value = "/conditionals")
	  public ModelAndView thymeleafConditionals() {
	  modelAndView.addObject("isActive", true);
	  modelAndView.addObject("gender", "male");
	  List<String> namesList = List.of("Manaan", "Bhat", "Azam", "Bhat");
	  modelAndView.addObject("namesList", namesList);
	  modelAndView.setViewName("thymleaf-form1");

	  
	  return modelAndView;
	  }
	  
		/*
		 * public ModelAndView thymeleafFragments() {
		 * 
		 * }
		 * 
		 * public ModelAndView thymeleafInheritance() {
		 * 
		 * }
		 */
	 

}
