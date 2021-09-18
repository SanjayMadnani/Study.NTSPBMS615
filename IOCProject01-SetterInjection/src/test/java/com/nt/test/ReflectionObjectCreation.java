package com.nt.test;

import java.lang.reflect.Constructor;

public class ReflectionObjectCreation {
	
	int i = 10;
	int j = 20;
	int k = 30;
	
	
	public ReflectionObjectCreation(int i, int j, int k) {
		System.out.println("ReflectionObjectCreation.ReflectionObjectCreation()");
		this.i = i;
		this.j = j;
		this.k = k;
	}


	@Override
	public String toString() {
		return "ReflectionObjectCreation [i=" + i + ", j=" + j + ", k=" + k + "]";
	}
	
	
	public static void main(String[] args) throws Exception {
		Constructor<ReflectionObjectCreation> con =  ReflectionObjectCreation.class.getConstructor(int.class, int.class, int.class);
		ReflectionObjectCreation obj = con.newInstance(100, 200, 300);
		System.out.println(obj);
		
	}

}
