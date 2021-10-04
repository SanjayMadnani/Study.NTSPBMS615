package com.nt.comp;

public class CNGEngine implements Engine {
	
	public CNGEngine() {
		System.out.println("CNGEngine.CNGEngine() - 0 Param Cons");
	}

	@Override
	public double getRPMSpeed() {
		return 3000;
	}

	@Override
	public String getType() {
		return "CNG";
	}

}
