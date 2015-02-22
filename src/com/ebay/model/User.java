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

	/**
	 * creates a user 
	 * @param id
	 * @param name
	 * @param surname
	 * @param email
	 * @param password
	 * @param registered
	 */
	public User(int id, String name, String surname, String email,
			String password, String registered) {};

}
