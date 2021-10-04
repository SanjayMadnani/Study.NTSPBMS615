package com.nt.comp;

public class Vehicle {
	
	Engine engine;

	public Vehicle(Engine engine) {
		System.out.println("Vehicle.Vehicle() - 1 Param Cons");
		this.engine = engine;
	}
	
	public String driveVehicle() {
		System.out.println("Vehicle.driveVehicle()");
		return "You are driving vehicle having: " + engine.getType() + " engine Type and max RPM speed:: " + engine.getRPMSpeed();
	}

}
