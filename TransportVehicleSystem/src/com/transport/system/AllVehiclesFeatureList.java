package com.transport.system;

public class AllVehiclesFeatureList {

	public static void main(String[] args) {
		
		Car car = new Car();
		Bus bus = new Bus();
		Truck truck = new Truck();
		
		System.out.println("This car has ABS?: " + car.ABS());
		System.out.println("This car has Carriage Facility?: " + car.carriageFacility() + "\n");
		
		System.out.println("This Truck has ABS?: " + truck.ABS());
		System.out.println("This Truck has Carriage Facility?: " + truck.carriageFacility() + "\n");
		
		System.out.println("This bus has ABS?: " + bus.ABS());
		System.out.println("This bus has Carriage Facility?: " + bus.carriageFacility() + "\n");
		
		if(truck.carriageFacility() == true) {
			System.out.println("Truck Ready to work as a transport vehicle");
		}
		
		else if(bus.carriageFacility() == true) {
			System.out.println("Bus Ready to work as transport vehicle");
		}
		
		else if(car.carriageFacility() == true) {
			System.out.println("Car Ready to work as transport vehicle");
		}
	}

	
}
