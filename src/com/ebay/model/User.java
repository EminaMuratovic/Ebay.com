package com.ebay.model;

import java.util.Date;

/**
 * This class creates user
 * Every user has its own private info and 
 * Date that he registered
 * @author mustafa && emina
 */
public class User {

	public int id;
	public String name;
	public String surname;
	public String email;
	public String password;
	public Date registered;
	public String role;

	/**
	 * creates a user 
	 * @param id int id of the user
	 * @param name String name of the user
	 * @param surname String surname of the user
	 * @param email String email of the user
	 * @param password String password of the user
	 * @param registered Date date of the registration
	 */
	public User(int id, String name, String surname, String email, String password, Date registered, String role) {}
	
	public boolean save(){
		return false;
		}
	
	/**
	 * updates user in the database
	 */
	public void update() {};
	
	/**
	 * deletes user from the database
	 */
	public static void delete() {}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the registered
	 */
	public Date getRegistered() {
		return registered;
	}

	/**
	 * @param registered the registered to set
	 */
	public void setRegistered(Date registered) {
		this.registered = registered;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	};

	
	
	

}