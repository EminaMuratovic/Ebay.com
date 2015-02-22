package com.ebay.model;

/**
 * This class creates user
 * Every user has its own private info and 
 * Date that he registered
 * @author mustafa && emina
 *
 */
public class User {

	public int id;
	public String name;
	public String surname;
	public String email;
	public String password;
	public String registered;
	public String role;

	/**
	 * creates a user 
	 * @param id
	 * @param name
	 * @param surname
	 * @param email
	 * @param password
	 * @param registered
	 */
	public User(int id, String name, String surname, String email, String password, String registered, String role) {}
	
	public boolean save(){
		return false;
		}
	
	public void update() {};
	
	public static void delete() {};


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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

	public String getRegistered() {
		return registered;
	}

	public void setRegistered(String registered) {
		this.registered = registered;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	};
	
	

}
