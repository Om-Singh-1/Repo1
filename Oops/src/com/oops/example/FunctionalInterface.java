package com.oops.example;

interface FunInterface {
	
	abstract void show();
	
	default int display(int num1, int num2) {
		
		System.out.println(num1+num2);
		
		return num1*num2;
	}
	
}

public class FunctionalInterface implements FunInterface{

	@Override
	public void show() {
		System.out.println("Welcome.");
	}
	
	public static void main(String[] args) {
	
		FunctionalInterface fun = new FunctionalInterface();
		fun.show();
		fun.display(10, 2);
	
	}
}
