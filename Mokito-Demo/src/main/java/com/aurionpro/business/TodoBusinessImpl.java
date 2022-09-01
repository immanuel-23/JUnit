package com.aurionpro.business;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.ITodoService;

public class TodoBusinessImpl {
	private ITodoService todoService;

	public TodoBusinessImpl(ITodoService todoService) {
		super();
		this.todoService = todoService;
	}
	public List<String> retriveTodosRelatedService(String users){
		List<String>filterTodos= new ArrayList<String>();
		List<String> todos=todoService.retriveTodos(users);
		for(String todo:todos) {
			if(todo.contains("Spring")) {
				filterTodos.add(todo);
				
			}
		}
		return filterTodos;
	}
	
	

}
