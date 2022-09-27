package com.oops.example;

abstract class Bike {
	abstract void run();
}

public class Test extends Bike implements Rider{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("It's Running.");
	}
	
	
	public static void main(String[] args) {
		Test rider = new Test();
		rider.run();
		rider.blood();
	}


	@Override
	public void blood() {
		// TODO Auto-generated method stub
		System.out.println("Rider has fallen with broken knees.");
	}


	@Override
	public void flesh() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void skinColor() {
		// TODO Auto-generated method stub
		
	}

	
	
}
