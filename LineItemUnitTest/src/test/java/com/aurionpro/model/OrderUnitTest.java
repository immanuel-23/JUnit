package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.aurionpro.model.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OrderUnitTest {

	// TODO Auto-generated method stub
	Product p1 = new Product(1, "Laptop", 30000, 10);
	Product p2 = new Product(2, "SmartWatch", 3000, 6);
	Product p3 = new Product(3, "Shoes", 800, 10);

	Product p4 = new Product(4, "Cake", 3000, 10);
	Product p5 = new Product(5, "Char", 8000, 6);
	Product p6 = new Product(6, "Bench", 900, 10);

	LineItem l1 = new LineItem(101, 2, p1);
	LineItem l2 = new LineItem(102, 5, p2);
	LineItem l3 = new LineItem(103, 3, p3);

	LineItem l4 = new LineItem(101, 2, p4);
	LineItem l5 = new LineItem(102, 5, p5);
	LineItem l6 = new LineItem(103, 3, p6);

	List<LineItem> lineItems1 = new ArrayList<LineItem>();
	List<LineItem> lineItems2 = new ArrayList<LineItem>();

	Order order1 = new Order(201, "22-03-22");
	Order order2 = new Order(201, "22-03-22");
	Customer customer1 = new Customer(1, "Immanuel");

	@BeforeAll
	void beforeEach() {
		lineItems1.add(l1);
		lineItems1.add(l2);
		lineItems1.add(l3);
		lineItems2.add(l4);
		lineItems2.add(l5);
		lineItems2.add(l6);

		order1.addLineItems(lineItems1);
		order2.addLineItems(lineItems2);

		customer1.addOrder(order1);
		customer1.addOrder(order2);

	}

	@Test
	@DisplayName("Order 1 price")
	void test_order1_Price() {

		double expected = 77395.18333333333;
		double actual = order1.calculateOrderPrice();
		assertEquals(expected, actual);

	}

	@Test
	@DisplayName("Order 2 price")
	void test_order2price() {

		double expected = 48695.625;
		double actual = order2.calculateOrderPrice();
		assertEquals(expected, actual);

	}

	@Test
	@DisplayName("Order 1 and 2 price")
	void test_order1order2price() {
		double expected = 126090.80833333333;
		double actual = order1.calculateOrderPrice();
		actual = actual + order2.calculateOrderPrice();
		assertEquals(expected, actual);

	}

//		System.out.println("Total Count of orders :" + customer1.orderCount());
//
//		System.out.println("Total order 1 Price " + order1.calculateOrderPrice());
//		System.out.println("Total order 2 Price " + order2.calculateOrderPrice());
//		System.out.println(
//				"Total of order 1 and order 2: " + (order1.calculateOrderPrice() + order2.calculateOrderPrice()));
//		
//
//		for (LineItem li : lineItems1) {
//			System.out
//					.println("Line item cost of " + li.getProduct().getName() + "  is :" + li.calculateLineItemCost());
//		}
//		System.out.println(
//				"*************************************************** Line Item 2 ********************************************");
//		for (LineItem li : lineItems2) {
//			System.out
//					.println("Line item cost of " + li.getProduct().getName() + "  is :" + li.calculateLineItemCost());
//		}
//		System.out.println(
//				"**********************************************************************************************");
//
//		System.out.println("Displaying all line items of customer orders");
//		System.out.println("List of items in 1 order:" + order1.getItems());
//		System.out.println("List of items in 2 order:" + order2.getItems());

}
