package com.nt.factory;

import com.nt.comp.BudgetCar;
import com.nt.comp.Car;
import com.nt.comp.LuxoryCar;
import com.nt.comp.SportsCar;

public class CarFactory {
	
	public static  Car createCar(String regNo, String type) {
		if("sports".equalsIgnoreCase(type))
			return new SportsCar(regNo);
		else if("budget".equalsIgnoreCase(type))
			return new BudgetCar(regNo);
		else if("luxory".equalsIgnoreCase(type))
			return new LuxoryCar(regNo);
		else throw new IllegalArgumentException("Invalid Car Type");
	}

}
