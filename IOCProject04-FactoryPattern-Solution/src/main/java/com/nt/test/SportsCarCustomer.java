package com.nt.test;

import com.nt.comp.Car;
import com.nt.comp.SportsCar;
import com.nt.factory.CarFactory;

public class SportsCarCustomer {
	public static void main(String[] args) {
		Car car = CarFactory.createCar("TS11", "sports");
		car.drive();
	}

}
