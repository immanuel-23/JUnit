package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int id;
	private String date;
	private List<LineItem> items = new ArrayList<LineItem>();

	public Order(int id, String date) {
		this.id = id;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public void addLineItems(List<LineItem> li) {
		this.items = li;
	}

	public int itemCount() {
		int count = 0;
		for (LineItem i : items) {
			count++;
		}
		return count;

	}

	public double calculateOrderPrice() {
		double  price = 0;
		for (LineItem i : items) {

			price =  (i.calculateLineItemCost() + price);

		}
		return price;

	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", items=" + items + "]";
	}

}
