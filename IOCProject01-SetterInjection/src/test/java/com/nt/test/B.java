package com.nt.test;

import java.lang.reflect.Constructor;

class A {
	public void m1() {
		System.out.println("A.m1()");
	}
	
	public void m2() {
		System.out.println("A.m2()");
		this.m1();
	}
}

public class B extends A{
	public void m1() {
		System.out.println("B.m1()");
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("::Test1::");
//		B b = (B) Class.forName("com.nt.test.B").newInstance();
		B b  = (B) B.class.getConstructor().newInstance();
		b.m2();
		
		System.out.println(b.hashCode());
		
		System.out.println("::Test2::");
		A a = (B) Class.forName("com.nt.test.B").newInstance();
		a.m2();
		
		System.out.println(a.hashCode());
	}
}
