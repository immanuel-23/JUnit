package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int id;
	private String name;
	private List<Order> orders = new ArrayList<Order>();

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void addOrder(Order order) {
		this.orders.add(order);
	}

	public int orderCount() {
		int count = 0;
		for (Order o : this.orders) {
			count++;
		}
		return count;

	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", orders=" + orders + "]";
	}

}
