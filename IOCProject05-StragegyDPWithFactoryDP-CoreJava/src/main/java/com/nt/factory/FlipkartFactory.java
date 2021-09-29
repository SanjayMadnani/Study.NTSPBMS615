package com.nt.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.Flipkart;

public class FlipkartFactory {
	
	private static Properties properties;
	
	static {
		try {
			FileInputStream fis = new FileInputStream("src/main/java/com/nt/common/Info.porperties");
			properties = new Properties();
			properties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Flipkart createFlipkart() throws Exception {
		Flipkart flipkart = new Flipkart();
		Class c = Class.forName(properties.getProperty("dependent.comp"));
		Constructor cons[] = c.getDeclaredConstructors();
		Courier courier = (Courier) cons[0].newInstance();
		flipkart.setCourier(courier);
		return flipkart;
	}
	
	/*public static Flipkart createFlipkart(String courierType) {
		Flipkart flipkart = new Flipkart();
		Courier courier = null;
		if("DTDC".equalsIgnoreCase(courierType)) {
			courier = new DTDC();
		} else if("BlueDart".equalsIgnoreCase(courierType)) {
			courier = new BlueDart();
		} else {
			throw new IllegalArgumentException("Invalid Courier Type");
		}
		flipkart.setCourier(courier);
		return flipkart;
	}*/

}
