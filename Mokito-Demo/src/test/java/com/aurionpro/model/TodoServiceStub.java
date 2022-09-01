package com.aurionpro.model;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements ITodoService {
// this is a mock implementaion
	public List<String> retriveTodos(String args) {
		// TODO Auto-generated method stub
		return Arrays.asList("Learn Spring mvc","Learn Spring","Learn to Dance","Spring");
	}

}
