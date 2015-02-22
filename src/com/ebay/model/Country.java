package com.ebay.model;

/**
 * Class country determined from witch country is user, buyer or seller, to be
 * able to calculate the shipping
 * 
 * @author mustafa
 *
 */

public class Country {
	
	public int id;
	public String name;
	public String countryCode;
	
	
	public Country(int id, String name, String countryCode) {
		
		this.id = id;
		this.name = name;
		this.countryCode = 	countryCode;
	}
}
