package com.java.mvc.operations.SpringMVC.service;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.mvc.operations.SpringMVC.DAO.CRUDDAO;
import com.java.mvc.operations.SpringMVC.Entity.UserEntity;

@Service
public class CRUDService {
	@Autowired
	CRUDDAO cruddao;
	
	public void saveUsertoDB(UserEntity entity) {
		cruddao.save(entity);
	}
	

	public void deleteUser(String userName) {
		Optional<UserEntity> findById = cruddao.findById(userName);
		findById.ifPresent(userEntity -> cruddao.delete(userEntity));
	}
	
	public Optional<UserEntity>  findUser(String userName) {
		Optional<UserEntity> findById = cruddao.findById(userName);
		return findById;
	}
	
	public List<UserEntity> findAll() {
		List<UserEntity> findAll = (List<UserEntity>) cruddao.findAll();
		return findAll;
	}
	
	public List<UserEntity> findByUserName(String userName){
		return cruddao.findByUserName(userName);
		 
	}
	
	
	
}
