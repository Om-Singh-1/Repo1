package com.oops.example;

public class Student extends School {

	@Override
	void attendance() {
		// TODO Auto-generated method stub
		System.out.println("Attendance method");
		
	}
	
	public static void main(String args[]) {
		Student S = new Student();
		S.attendance();;
	}

	
	
}
