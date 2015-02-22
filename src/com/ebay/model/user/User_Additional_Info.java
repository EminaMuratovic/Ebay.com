package com.ebay.model.user;


/**
 * More information about user
 * 
 * @author mustafa
 *
 */

public class User_Additional_Info {
	
	public User user_id;
	public String phone;
	public String address;
	public String city;
	public String gender;
	public Country country_id;
	public String shipping_address;
	
	
	public User_Additional_Info(User user_id, String phone, String address,
			String city, String gender, Country country_id,
			String shipping_address) {
		
		this.user_id = user_id;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.gender = gender;
		this.country_id = country_id;
		this.shipping_address = shipping_address;
	}
	
}
