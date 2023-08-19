package com.java.mvc.operations.SpringMVC.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.java.mvc.operations.SpringMVC.Entity.UserEntity;
import com.java.mvc.operations.SpringMVC.service.CRUDService;

@RestController
public class ThymeleafController {
	@Autowired
	CRUDService crudService;
	private static ModelAndView modelAndView = new ModelAndView();

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

	@GetMapping("/dynamic-parsing")
	public ModelAndView thymeleafFragments() {

		modelAndView.addObject("title", "Main Fragment");
		modelAndView.addObject("serviceInvoker", "Handler Class");
		modelAndView.setViewName("thymleaf-form1");
		return modelAndView;
	}
	
	@GetMapping(value = "login")
	public ModelAndView loginPage() {
		modelAndView.setViewName("Thymeleaf-Login");
		return modelAndView;
	}
	@PostMapping(value = "/loginUser")
	public ModelAndView loginUser(@RequestParam String UserName, @RequestParam String password) {
		System.out.println("---------------------------------------------------------");
		ModelAndView modelAndView = new ModelAndView();
		Optional<UserEntity> findUser = crudService.findUser(UserName);
		findUser.ifPresent(userEntity -> {
			System.out.println("---------------------------------------------------------");
			if(userEntity.getUserName().equalsIgnoreCase(UserName) && userEntity.getPassword().equals(password)) {
				modelAndView.addObject("UserName",userEntity.getUserName());
				modelAndView.setViewName("Thymeleaf-Success");
				
				
			} 
			else {
				modelAndView.setViewName("errorHandlerPage");
			}
		});
		return modelAndView;
		

	}

}
