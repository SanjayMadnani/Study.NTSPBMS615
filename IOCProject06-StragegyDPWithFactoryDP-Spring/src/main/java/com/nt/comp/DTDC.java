package com.nt.comp;

public class DTDC implements Courier {
	
	public DTDC() {
		System.out.println("DTDC.DTDC():: 0-Param constructor");
	}

	@Override
	public String deliver(int orderId) {
		return "Order ID: " + orderId + " is delivered by DTDC";
	}

}
