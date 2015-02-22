package com.ebay.model;
/**
 * More information about user
 * @author mustafa && emina
 */
public class User_Additional_Info {
	
	public User user_id;
	public String phone;
	public String address;
	public String city;
	public char gender;
	public Country country_id;
	public String shipping_address;
	
	/**
	 * creates additional user info
	 * @param user_id int id of the user
	 * @param phone String phone number of the user
	 * @param address String address of the user
	 * @param city String city of the user
	 * @param gender char gender of the user
	 * @param country_id int id of the country
	 * @param shipping_address String shipping address
	 */
	public User_Additional_Info(User user_id, String phone, String address,
			String city, char gender, Country country_id,
			String shipping_address) {}
	
	/**
	 * saves user additional info to the database
	 * @return true or false
	 */
	public boolean save(){
		return false;
		}
	
	/**
	 * updates user additional info to the database
	 */
	public void update() {};
	
	/**
	 * deletes user additional info from the database
	 */
	public static void delete() {}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the shipping_address
	 */
	public String getShipping_address() {
		return shipping_address;
	}

	/**
	 * @param shipping_address the shipping_address to set
	 */
	public void setShipping_address(String shipping_address) {
		this.shipping_address = shipping_address;
	}

	/**
	 * @return the user_id
	 */
	public User getUser_id() {
		return user_id;
	}

	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}

	/**
	 * @return the country_id
	 */
	public Country getCountry_id() {
		return country_id;
	};
			
	
}
