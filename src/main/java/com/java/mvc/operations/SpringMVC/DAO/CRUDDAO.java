package com.java.mvc.operations.SpringMVC.DAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.java.mvc.operations.SpringMVC.Entity.UserEntity;

public interface CRUDDAO extends CrudRepository<UserEntity, String> {
	
	public List<UserEntity> findByUserName(String userName);

}
