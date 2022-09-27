package com.oops.example;

class Parent {
	
	public void showMessage() {
		System.out.println("From Parent");
	}
	
}

class Child extends Parent{
	
	public void showMessage() {
		System.out.println("In Child Class");
	}
	
}

public class MethodOverridingEx {

	public static void main(String[] args) {
		Child child = new Child();
		child.showMessage();
	}
	
}
