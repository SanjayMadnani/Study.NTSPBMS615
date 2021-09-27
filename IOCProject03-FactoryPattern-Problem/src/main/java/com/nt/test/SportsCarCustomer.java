package com.nt.test;

import com.nt.comp.Car;
import com.nt.comp.SportsCar;

public class SportsCarCustomer {
	public static void main(String[] args) {
		Car car = new SportsCar("TS11");
		car.drive();
	}

}
