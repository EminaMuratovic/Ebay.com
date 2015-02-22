package com.ebay.model;

/**
 * This class separates the countries and their shippment id and shippment price
 * @author BITBay
 *
 */
public class Shippment {
	
	public String type;
	public float price;
	public int country_id;
	public int shippment_id;
	
	/**
	 * Creates a shippment
	 * @param type String type of the shippment
	 * @param price float price of the shippment
	 * @param country_id int id of the country
	 * @param shippment_id int id of the shippment
	 */
	public Shippment(String type, int price, int country_id, int shippment_id) {}
	
	/**
	 * saves the shippment to database
	 * @return true or false
	 */
	public boolean save(){
		return false;
		}
	
	/**
	 * updates the shippment to database
	 */
	public void update() {};
	
	/**
	 * deletes the shippment from database
	 */
	public static void delete() {}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @return the country_id
	 */
	public int getCountry_id() {
		return country_id;
	}

	/**
	 * @return the shippment_id
	 */
	public int getShippment_id() {
		return shippment_id;
	};

	
}
