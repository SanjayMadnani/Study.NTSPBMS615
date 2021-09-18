package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	Date date;

	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator.1-param constructor");
		this.date = date;
	}
	
	public String generateMessage(String name) {
		System.out.println("WishMessageGenerator.generateMessage()");
		int hour = date.getHours();
		
		if(hour < 12) return "Good Morning " + name;
		else if(hour < 16) return "Good Afternoon " + name;
		else if(hour < 20) return "Good Evening " + name;
		else return "Good Night " + name;
	}

}
