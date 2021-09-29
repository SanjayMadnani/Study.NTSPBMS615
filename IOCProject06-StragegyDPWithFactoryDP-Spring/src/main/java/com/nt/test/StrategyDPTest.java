package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Flipkart;

public class StrategyDPTest {
	
	public static void main(String[] args) throws Exception {
		System.out.println("StrategyDPTest.main()");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/config/applicationContext.xml");
		Flipkart flipkart = factory.getBean("flipKart", Flipkart.class);
		
		String result = flipkart.Shopping(new double[] {1000.00, 2000.00, 10000}, "Shirt", "Trouer", "Mobile");
		System.out.println(result);
	}

}
