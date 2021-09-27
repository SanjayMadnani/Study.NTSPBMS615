package com.nt.comp;

public class SportsCar implements Car {
	
	private String regNo;
	
	public SportsCar(String regNo) {
		System.out.println("SportsCar.SportsCar() - 1 Param constructor");
		this.regNo = regNo;
	}

	@Override
	public void drive() {
		System.out.println("Driving SportsCar with regNo::" + regNo);

	}

}
