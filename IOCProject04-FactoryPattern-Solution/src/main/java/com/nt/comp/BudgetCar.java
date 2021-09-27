package com.nt.comp;

public class BudgetCar implements Car {
	
	private String regNo;

	public BudgetCar(String regNo) {
		System.out.println("BudgetCar.BudgetCar() - 1 Param constructor");
		this.regNo = regNo;
	}

	@Override
	public void drive() {
		System.out.println("Driving BudgetCar with regNo::" + regNo);

	}

}
