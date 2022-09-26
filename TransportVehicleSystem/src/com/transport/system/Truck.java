package com.transport.system;

public class Truck extends VehicleFeatures{

	@Override
	boolean PowerSteer() {
		return true;
	}

	@Override
	boolean ABS() {
		return false;
	}

	@Override
	boolean rearDisc() {
		return false;
	}

	@Override
	boolean carriageFacility() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	boolean FogLamp() {
		// TODO Auto-generated method stub
		return false;
	}

}
