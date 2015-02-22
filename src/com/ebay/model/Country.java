package com.ebay.model;

/**
 * Class country determined from witch country is the user
 * @author mustafa && emina
 */
public class Country {
    int id;
	public String name;
	public String countryCode;
	
	public Country(int id, String name, String countryCode) {}
	
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

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	};
	
	
}
