package com.ebay.model;

/**
 * This class is extended from the class Order
 * It gives us main order details
 * @author BITBay
 *
 */
public class Order_details {
	public int order_id;
	public int product_id;
	
	/**
	 * Creates order details
	 * @param order_id int id of the order
	 * @param product_id int id of the product
	 */
	public Order_details(int order_id, int product_id) {}
	
	/**
	 * saves the order details to database
	 * @return true or false
	 */
	public boolean save(){
		return false;
		}
	
	/**
	 * updates the order details to database
	 */
	public void update() {};
	
	/**
	 * deletes the order details from database
	 */
	public static void delete() {}

	/**
	 * @return the order_id
	 */
	public int getOrder_id() {
		return order_id;
	}

	/**
	 * @return the product_id
	 */
	public int getProduct_id() {
		return product_id;
	};

	
	
}
