package com.aurionpro.model;

public class LineItem {
	private int id;
	private int quantity;
	private Product product;

	public int getId() {
		return id;
	}

	public int getQuality() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}

	public LineItem(int id, int quality, Product product) {
		this.id = id;
		this.quantity = quality;
		this.product = product;
	}

	public double calculateLineItemCost() {
		return (product.calculatePriceAfterDiscount())*quantity;

	}

	@Override
	public String toString() {
		return "LineItem [id=" + id + ", quality=" + quantity + ", product=" + product + "]";
	}

}
