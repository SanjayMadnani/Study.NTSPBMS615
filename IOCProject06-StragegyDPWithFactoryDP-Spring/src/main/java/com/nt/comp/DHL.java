package com.nt.comp;

public class DHL implements Courier {
	
	public DHL() {
		System.out.println("DHL.DHL() :: 0-Param constructor");
	}

	@Override
	public String deliver(int orderId) {
		return "Order ID: " + orderId + " is delivered by DHL";
	}

}
