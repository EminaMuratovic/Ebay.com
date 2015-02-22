package com.ebay.model;

import java.util.Date;

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
	public float price;
	public Date created;
	public String description;
	public String image;
	public int quantity;
	public int category_id;
	public int owner_id;
	public int product_id;
	
	/**
	 * Creates a product
	 * @param name String name of the product
	 * @param price float price of the product
	 * @param created Date date of the creation of the product
	 * @param description String description of the product
	 * @param image String url of the image
	 * @param quantity int quantity of the product
	 * @param category_id int id of the category
	 * @param owner_id int id of the owner
	 * @param product_id int id of the product
	 */
	public Product(String name, float price, Date created,
			String description, String image, int quantity, int category_id,
			int owner_id, int product_id) {}
	
	/**
	 * saves the product in the database
	 * @return true or false
	 */
	public boolean save(){
		return false;
		}
	
	/**
	 * updates a product in database
	 */
	public void update() {};
	
	/**
	 * deletes a product from the database
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

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
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * @return the category_id
	 */
	public int getCategory_id() {
		return category_id;
	}

	/**
	 * @return the owner_id
	 */
	public int getOwner_id() {
		return owner_id;
	}

	/**
	 * @return the product_id
	 */
	public int getProduct_id() {
		return product_id;
	};
			
			

	
}
