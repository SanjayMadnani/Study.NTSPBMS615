package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Vehicle;

public class StrategyDPTest {
	
	public static void main(String[] args) {
		System.out.println("StrategyDPTest.main()");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com\\nt\\config\\applicationContext.xml");
		
		Vehicle vehicle = factory.getBean("vehicle", Vehicle.class);
		
		System.out.println(vehicle.driveVehicle());
	}

}
