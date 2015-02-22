package com.ebay.model;


/**
 * More information about user
 * @author mustafa && emina
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
			String shipping_address) {}
	
	public boolean save(){
		return false;
		}
	
	public void update() {};
	
	public static void delete() {};



	public User getUser_id() {
		return user_id;
	}


	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Country getCountry_id() {
		return country_id;
	}


	public void setCountry_id(Country country_id) {
		this.country_id = country_id;
	}


	public String getShipping_address() {
		return shipping_address;
	}


	public void setShipping_address(String shipping_address) {
		this.shipping_address = shipping_address;
	};
			
			
	
}
