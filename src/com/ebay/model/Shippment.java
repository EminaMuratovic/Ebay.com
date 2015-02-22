package com.ebay.model;

public class Shippment {
	
	public String type;
	public int price;
	public int country_id;
	public int shippment_id;
	
	public Shippment(String type, int price, int country_id, int shippment_id) {}
	
	public boolean save(){
		return false;
		}
	
	public void update() {};
	
	public static void delete() {};


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public int getShippment_id() {
		return shippment_id;
	}

	public void setShippment_id(int shippment_id) {
		this.shippment_id = shippment_id;
	};
	
	
}
