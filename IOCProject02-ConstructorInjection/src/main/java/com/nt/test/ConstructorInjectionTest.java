package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjectionTest {
	
	public static void main(String[] args) {
		FileSystemResource resource = new FileSystemResource("src/main/java/com/nt/config/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		WishMessageGenerator messageGenerator = (WishMessageGenerator) factory.getBean("wmg");
		System.out.println(messageGenerator.generateMessage("Sanjay"));
		
		System.out.println();
//		object for wmg already exist, hence no new object will be created
		messageGenerator = (WishMessageGenerator) factory.getBean("wmg");
//		new object for a will be created using 0-param constructor
		messageGenerator = (WishMessageGenerator) factory.getBean("a");
//		new object for b will be created using 0-param constructor
		messageGenerator = (WishMessageGenerator) factory.getBean("b");
	}
	
}
