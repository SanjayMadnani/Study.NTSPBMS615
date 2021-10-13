package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.A;
import com.nt.beans.B;

public class CyclicDITest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/config/applicationContext.xml");
		
		A obj1 = factory.getBean("a1", A.class);
		System.out.println(obj1);
		
//		B ob = factory.getBean("b1", B.class);
//		System.out.println(ob);
		
		B ob2 = factory.getBean("b2", B.class);
		System.out.println(ob2);
		

	}

}
