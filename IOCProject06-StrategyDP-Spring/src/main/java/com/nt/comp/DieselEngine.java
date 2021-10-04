package com.nt.comp;

public class DieselEngine implements Engine {
	
	public DieselEngine() {
		System.out.println("DieselEngine.DieselEngine() - 0 Param Cons");
	}

	@Override
	public double getRPMSpeed() {
		return 1000;
	}

	@Override
	public String getType() {
		return "Diesel";
	}

}
