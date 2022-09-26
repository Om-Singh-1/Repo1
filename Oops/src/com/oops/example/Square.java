package com.oops.example;

public class Square extends Area{

	void area() {
		System.out.println("Inside Square Class");
	}
	
	public static void main(String[] args) {
		Square square = new Square();
		square.area();
	}
	
}
