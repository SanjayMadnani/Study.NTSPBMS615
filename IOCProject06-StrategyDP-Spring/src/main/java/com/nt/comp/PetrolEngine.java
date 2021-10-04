package com.nt.comp;

public class PetrolEngine implements Engine {
	
	public PetrolEngine() {
		System.out.println("PetrolEngine.PetrolEngine() - 0 Param Cons");
	}

	@Override
	public double getRPMSpeed() {
		return 5000;
	}

	@Override
	public String getType() {
		return "Petrol";
	}

}
