package com.ebay.model;

/**
 * This class creates a category
 * If the category has no parent(it's a main category), parent_id sets to null
 * @author BITBay
 *
 */
public class Category {
	
	public String name;
	public int parent_id;
	public int category_id;
	
	/**
	 * creates a category
	 * @param name String name of the category
	 * @param parent_id int id of the parent category
	 * @param category_id id of this category
	 */
	public Category(String name, int parent_id, int category_id){};
	
	/**
	 * saves the category to database
	 * @return true or false
	 */
	public boolean save(){
		return false;
		}
	
	/**
	 * updates a category to database
	 */
	public void update() {};
	
	/**
	 * deletes a category from the database
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
	 * @return the parent_id
	 */
	public int getParent_id() {
		return parent_id;
	}

	/**
	 * @return the category_id
	 */
	public int getCategory_id() {
		return category_id;
	};

	

}