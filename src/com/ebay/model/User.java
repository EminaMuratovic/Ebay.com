package com.ebay.model;

/**
 * Class which simulates user of our service, and his characteristics.
 * 
 * @author mustafa
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
	 * Constructor
	 * 
	 * @param id
	 * @param name
	 * @param surname
	 * @param email
	 * @param password
	 * @param registered
	 */
	public User(int id, String name, String surname, String email,
			String password, String registered, String role) {};

}
