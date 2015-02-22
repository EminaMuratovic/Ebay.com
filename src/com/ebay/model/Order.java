package com.ebay.model;

public class Order {
	
	public int order_id;
	public int buyer_id;
	public int seller_id;
	public int product_id;
	public int quantity;
	public int product_price;
	public int shipment_id;
	public int total;
	
	public Order(int order_id, int buyer_id, int seller_id, int product_id,
			int quantity, int product_price, int shipment_id, int total) {}
	
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

	public int getBuyer_id() {
		return buyer_id;
	}

	public void setBuyer_id(int buyer_id) {
		this.buyer_id = buyer_id;
	}

	public int getSeller_id() {
		return seller_id;
	}

	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public int getShipment_id() {
		return shipment_id;
	}

	public void setShipment_id(int shipment_id) {
		this.shipment_id = shipment_id;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	};
			
			
	
	
	
	
}
