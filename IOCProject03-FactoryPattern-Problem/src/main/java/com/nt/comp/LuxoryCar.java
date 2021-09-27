package com.nt.comp;

public class LuxoryCar implements Car {
	
	private String regNo;
	
	public LuxoryCar(String regNo) {
		System.out.println("LuxoryCar.LuxoryCar() - 1 Param constructor");
		this.regNo = regNo;
	}

	@Override
	public void drive() {
		System.out.println("Driving LuxoryCar with regNo::" + regNo);

	}

}
