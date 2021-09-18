package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		FileSystemResource res = new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		XmlBeanFactory fac = new XmlBeanFactory(res);
		WishMessageGenerator wmg = (WishMessageGenerator) fac.getBean("wmg");
		
		System.out.println("::Test Result::\n" + wmg.generateMessage("Sanjay"));
	}

}
