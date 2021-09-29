package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart.Flipkart() :: 0-Param Constructor");
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
	public String Shopping (double [] prices, String ...items) {
		double billAmt = 0.0;
		for (int i = 0; i < items.length; i++) {
			billAmt += prices[i];
		}
		
		int orderId = new Random().nextInt(100000);
		String status = courier.deliver(orderId);
		String finalMsg = Arrays.toString(items) + " are purchased with prices " + Arrays.toString(prices) + ". Total Bill AMT::" + billAmt;
		
		return finalMsg + ":::" + status;
	}

}
