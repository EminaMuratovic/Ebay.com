package com.ebay.model;

/**
 * This class creates a product 
 * Every product has a its own category where it came from,
 * Date when it was posted,
 * quantity of the product,
 * his price and description and image of the product.
 * @author mustafa && emina
 *
 */
public class Product {
	
	public String name;
	public String price;
	public String created;
	public String description;
	public String image;
	public int quantity;
	public int category_id;
	public int owner_id;
	public int product_id;
	
	public Product(String name, String price, String created,
			String description, String image, int quantity, int category_id,
			int owner_id, int product_id) {};

	
}
