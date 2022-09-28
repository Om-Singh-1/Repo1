package com.oops.example;

public class Jet extends Turbo{ 	
	
	@Override
	boolean hasTurbo() {			// Method Overriding (runtime polymorphism).
		return true;
		
	}
	public void JetCheck() {		// Method Overloading (compile time polymorphism)
		System.out.println("This is a jet.");
	}
	
	public int JetCheck(int count) {
		return count;
	}
	
	public static void main(String[] args) {
		
		Jet jet = new Jet();
		
		jet.JetCheck();
		jet.JetCheck(15);
		jet.hasTurbo();
		
	}
	
}
