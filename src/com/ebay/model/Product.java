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
			int owner_id, int product_id) {}
	
	public boolean save(){
		return false;
		}
	
	public void update() {};
	
	public static void delete() {};


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	};
			
			

	
}
