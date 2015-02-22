package com.ebay.model;

public class Category {
	
	public String name;
	public int parent_id;
	public int category_id;
	
	public Category(String name, int parent_id, int category_id){};
	
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

	public int getParent_id() {
		return parent_id;
	}

	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	};
	
	
	
}


	
