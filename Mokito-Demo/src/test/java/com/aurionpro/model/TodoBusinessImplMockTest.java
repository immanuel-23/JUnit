package com.aurionpro.model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.Test;

import com.aurionpro.business.TodoBusinessImpl;

public class TodoBusinessImplMockTest {

	@Test
	public void testretriveTodoRelatedToSppring_usingMock() {
		
		ITodoService todoServiceMock=mock(ITodoService.class);//  this will mock itodoservice 
		//mockTodoService.retriveTodos("parameters").return("Value");
		
		
		TodoBusinessImpl todoBusinessImpl= new TodoBusinessImpl(todoServiceMock);
		List<String>filterTodo=todoBusinessImpl.retriveTodosRelatedService("Dummy");
		
		assertEquals(0, filterTodo.size());
	}

}
