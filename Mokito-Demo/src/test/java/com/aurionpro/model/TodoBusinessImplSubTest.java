package com.aurionpro.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.aurionpro.business.TodoBusinessImpl;

public class TodoBusinessImplSubTest {

	@Test
	public void test() {
		ITodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl= new TodoBusinessImpl(todoServiceStub);
		List<String>filterTodo=todoBusinessImpl.retriveTodosRelatedService("Dummy");
		
		assertEquals(0, filterTodo.size());
	}

}
