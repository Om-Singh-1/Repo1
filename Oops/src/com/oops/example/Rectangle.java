package com.oops.example;

public class Rectangle extends Area{

	void area() {
		System.out.println("Inside Rectangle Class");
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.area();
	}
	
	
}
