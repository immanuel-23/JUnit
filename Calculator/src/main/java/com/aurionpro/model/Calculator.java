package com.aurionpro.model;

public class Calculator {
	CalculatorService service;
	
	public Calculator(CalculatorService service) {
		this.service=service;
	}
	
	public int perform1(int i, int j) {
		return service.add(i, j);
	}
	public int perform2(int i, int j) {
		return service.sub(i, j);
	}
	public int perform3(int i, int j) {
		return service.mul(i, j);
	}
	
	public int perform4(int i, int j) {
		if(j==0) {
			throw new RuntimeException("Arithmetic exception J cant be 0");
		}
		return service.div(i, j);
	}

}
