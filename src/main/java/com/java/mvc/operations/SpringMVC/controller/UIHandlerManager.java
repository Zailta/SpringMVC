package com.java.mvc.operations.SpringMVC.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.java.mvc.operations.SpringMVC.Entity.UserEntity;
import com.java.mvc.operations.SpringMVC.service.CRUDService;

@RestController
public class UIHandlerManager {
	
	@Autowired
	CRUDService crudService;
	
	/*
	 * Functions for JSP redirection starts 
	 * 
	 * */
	@RequestMapping(value = "/")
	public ModelAndView test() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@RequestMapping(value = "/addNewUserPage")
	public ModelAndView addNewUserPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("addNewUserPage");
		return modelAndView;
	}
	
	@RequestMapping(value = "/loginPage")
	public ModelAndView searchUserPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("loginPage");
		return modelAndView;
	}
	
	@RequestMapping(value = "/updatePage/{userName}")
	public ModelAndView updatePage(@PathVariable("userName") String userName) {
		ModelAndView modelAndView = new ModelAndView();
		Optional<UserEntity> findUser = crudService.findUser(userName);
		findUser.ifPresent(userEntity ->{
			modelAndView.addObject("userEntity", userEntity);
			modelAndView.setViewName("updatePage");
		});
		return modelAndView;
	}
	
	/*
	 * Functions for JSP redirection ends 
	 * 
	 * */
	
	/**
	 * 
	 * @param UserName
	 * @param password
	 * @return
	 */
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginUser(@RequestParam String UserName, @RequestParam String password) {
		ModelAndView modelAndView = new ModelAndView();
		Optional<UserEntity> findUser = crudService.findUser(UserName);
		findUser.ifPresent(userEntity -> {
			if(userEntity.getUserName().equalsIgnoreCase(UserName) && userEntity.getPassword().equals(password)) {
				modelAndView.addObject("userEntity", crudService.findAll());
				modelAndView.addObject("UserName",userEntity.getUserName());
				modelAndView.setViewName("searchUserPage");
				
			} 
			else {
				modelAndView.setViewName("errorHandlerPage");
			}
		});
		return modelAndView;

	}
	@RequestMapping(value = "/save", method = RequestMethod.POST) 
	public ModelAndView saveUser(@ModelAttribute UserEntity userEntity, @RequestParam("profileImage") MultipartFile file) throws IOException {
		userEntity.setImageEntity(file.getBytes());
		crudService.saveUsertoDB(userEntity);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userEntity", crudService.findAll());
		modelAndView.addObject("UserName",userEntity.getUserName());
		modelAndView.setViewName("searchUserPage");
		return modelAndView;
		}
	
	


	@RequestMapping(value = "/delete/{userName}", method = RequestMethod.GET) 
	public ModelAndView deleteUser(@PathVariable("userName") String userName) throws IOException {
		crudService.deleteUser(userName);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userEntity", crudService.findAll());
		modelAndView.setViewName("searchUserPage");
		return modelAndView;
		}
	
}
