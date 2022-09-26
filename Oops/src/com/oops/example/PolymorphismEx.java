package com.oops.example;


class Helper {
	static int Multiply(int a, int b) {
		return a * b;
	}
	
	static double Multiply(double a, double b) {
		return a * b;
	}
}
public class PolymorphismEx {
	
	public static void main(String[] args) {
	
		System.out.println("Ans: " + Helper.Multiply(5, 10));
		System.out.println("Ans: " + Helper.Multiply(6.6, 6.6));
		
	}

}
