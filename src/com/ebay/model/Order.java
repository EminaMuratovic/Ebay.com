package com.ebay.model;

/**
 * This class creates an order from the buyer
 * It has buyer id, seller id, th quantity of the product and his price
 * And shipment id, because every country has it's own shipment price
 * @author BITBay
 *
 */
public class Order {
	
	public int order_id;
	public int buyer_id;
	public int seller_id;
	public int product_id;
	public int quantity;
	public float product_price;
	public int shipment_id;
	public float total;
	
	/**
	 * creates an order
	 * @param order_id int id of the order
	 * @param buyer_id int id of buyer
	 * @param seller_id int id of the seller
	 * @param product_id int id of the product
	 * @param quantity int quantity of the product
	 * @param product_price float price of the product
	 * @param shipment_id int id of the shipment
	 * @param total float total price
	 */
	public Order(int order_id, int buyer_id, int seller_id, int product_id,
			int quantity, int product_price, int shipment_id, int total) {}
	
	/**
	 * saves the order in the database
	 * @return true or false
	 */
	public boolean save(){
		return false;
		}
	
	/**
	 * updates the order to database
	 */
	public void update() {};
	
	/**
	 * deletes the order from the database
	 */
	public static void delete() {}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the product_price
	 */
	public float getProduct_price() {
		return product_price;
	}

	/**
	 * @param product_price the product_price to set
	 */
	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}

	/**
	 * @return the total
	 */
	public float getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(float total) {
		this.total = total;
	}

	/**
	 * @return the order_id
	 */
	public int getOrder_id() {
		return order_id;
	}

	/**
	 * @return the buyer_id
	 */
	public int getBuyer_id() {
		return buyer_id;
	}

	/**
	 * @return the seller_id
	 */
	public int getSeller_id() {
		return seller_id;
	}

	/**
	 * @return the product_id
	 */
	public int getProduct_id() {
		return product_id;
	}

	/**
	 * @return the shipment_id
	 */
	public int getShipment_id() {
		return shipment_id;
	};
 
	
	
	
}
