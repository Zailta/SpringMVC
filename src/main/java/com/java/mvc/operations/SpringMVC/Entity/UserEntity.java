package com.java.mvc.operations.SpringMVC.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;



@Entity
@Table
public class UserEntity {
	
	@Id
	private String userName;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	@Lob
	private byte[] profilepicture;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * public int getID() { return ID; } public void setID(int iD) { ID = iD; }
	 */
	public byte[] getImageEntity() {
		return profilepicture;
	}
	public void setImageEntity(byte [] profilepicture) {
		this.profilepicture = profilepicture;
	}
	

	

}
