package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {

	Date date;

	//constructor-arg name="date" must match with @param date of this constructor
	//constructor can be private, still constructor injection will work
	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator.1-param constructor");
		this.date = date;
	}

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.0-Param Constructor");
	}

	//	property name="date" (or Date) must match with the set<Date> this method
	// Note: property name="Date" does not match with the set<date> method (Incorrect)
	//should be public then only setter injection will work
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}

	public String generateMessage(String name) {
		System.out.println("WishMessageGenerator.generateMessage()");
		int hour = date.getHours();

		if (hour < 12)
			return "Good Morning " + name + ", Date: " + date;
		else if (hour < 16)
			return "Good Afternoon " + name + ", Date: " + date;
		else if (hour < 20)
			return "Good Evening " + name + ", Date: " + date;
		else
			return "Good Night " + name + ", Date: " + date;
	}

}
