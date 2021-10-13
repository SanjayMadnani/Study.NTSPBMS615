package com.nt.beans;

public class B {
	
	private A a;

	public B() {
		System.out.println("B.B() :: 0 Param");
	}
	
	public B(A a) {
		System.out.println("B.B() :: 1 Param");
		this.a = a;
	}

	public void setA(A a) {
		System.out.println("B.setA() :: initiated");
		this.a = a;
		System.out.println("B.setA() :: completed");
	}

	@Override
	public String toString() {
		System.out.println("B.toString()");
		return "B [a=]";
	}
	
}
