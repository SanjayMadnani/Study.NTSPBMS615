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
	}
	
}
