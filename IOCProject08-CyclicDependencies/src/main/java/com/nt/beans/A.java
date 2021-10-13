package com.nt.beans;

public class A {
	
	private B b;

	public A() {
		System.out.println("A.A() - 0 Param");
	}

	public void setB(B b) {
		System.out.println("A.setB():: Initiated");
		this.b = b;
		System.out.println("A.setB():: completed");
	}

	@Override
	public String toString() {
		System.out.println("A.toString()");
		return "A [b=]";
	}
	
}
