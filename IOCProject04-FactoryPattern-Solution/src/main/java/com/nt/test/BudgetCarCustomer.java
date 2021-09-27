package com.nt.test;

import com.nt.comp.BudgetCar;
import com.nt.comp.Car;
import com.nt.factory.CarFactory;

public class BudgetCarCustomer {
	
	public static void main(String[] args) {
		Car car = CarFactory.createCar("MP44", "budget");
		car.drive();
	}

}
