package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {
	
	public static void main(String[] args) throws Exception {
		System.out.println("StrategyDPTest.main()");
		Flipkart flipkart = FlipkartFactory.createFlipkart();
		String result = flipkart.Shopping(new double[] {1000.00, 2000.00, 10000}, "Shirt", "Trouer", "Mobile");
		System.out.println(result);
	}

}
