package com.ebay.model;

public class Order_details {
	public int order_id;
	public int product_id;
	
	public Order_details(int order_id, int product_id) {}
	
	public boolean save(){
		return false;
		}
	
	public void update() {};
	
	public static void delete() {};


	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	};
	
	
	
}
