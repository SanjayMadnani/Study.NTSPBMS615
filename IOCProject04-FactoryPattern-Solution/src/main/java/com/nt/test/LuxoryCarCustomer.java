package com.nt.test;

import com.nt.comp.Car;
import com.nt.comp.LuxoryCar;
import com.nt.factory.CarFactory;

public class LuxoryCarCustomer {
	
	public static void main(String[] args) {
		Car car = CarFactory.createCar("KA05", "luxory");
		car.drive();
	}

}
