package com.ebay.model;

/**
 * Class country determined from witch country is the user
 * @author mustafa && emina
 */
public class Country {
    int id;
	public String name;
	public String countryCode;
	
	/**
	 * creates a country
	 * @param id int id of the country
	 * @param name String name of the country
	 * @param countryCode String country code
	 */
	public Country(int id, String name, String countryCode) {};
	
	/**
	 * saves the country in the database
	 * @return true or false
	 */
	public boolean save(){
		return false;
		}
	
	/**
	 * updates country in database
	 */
	public void update() {};
	
	/**
	 * deletes a country from the database
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
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	};

	
	
}
