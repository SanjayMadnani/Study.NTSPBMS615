package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.Flipkart;

public class FlipkartFactory {
	
	public static Flipkart createFlipkart(String courierType) {
		Flipkart flipkart = new Flipkart();
		Courier courier = null;
		if("DTDC".equalsIgnoreCase(courierType)) {
			courier = new DTDC();
		} else if("BlueDart".equalsIgnoreCase(courierType)) {
			courier = new BlueDart();
		} else {
			throw new IllegalArgumentException("Invalid Courier Type");
		}
		flipkart.setCourier(courier);
		return flipkart;
	}

}
