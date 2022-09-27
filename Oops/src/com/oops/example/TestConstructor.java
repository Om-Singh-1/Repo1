package com.oops.example;

public class TestConstructor {

	TestConstructor() {
		System.out.println("Inside Test Constructor");
	}
	
	public TestConstructor(int a, int b) {
		System.out.println("Multiplication: " + a * b);
	}
	
	public static void main(String[] args) {
		TestConstructor test = new TestConstructor(10, 5);
	}
}
