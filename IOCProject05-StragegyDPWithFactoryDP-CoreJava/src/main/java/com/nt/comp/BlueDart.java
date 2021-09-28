package com.nt.comp;

public class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("BlueDart.BlueDart():: 0-Param constructor");
	}

	@Override
	public String deliver(int orderId) {
		return "Order ID: " + orderId + " is delivered by BlueDart";
	}

}
