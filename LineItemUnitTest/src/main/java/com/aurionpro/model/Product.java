package com.aurionpro.model;

public class Product {

	private int id;
	private String name;
	private double price;
	private float discount;
	
	public Product(int id, String name, double price, float discount) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public float getDiscount() {
		return discount;
	}
	
	public double calculatePriceAfterDiscount() {
		
		return price-(discount/price)*100;
	
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", discount=" + discount + "]";
	}
	
	
}
