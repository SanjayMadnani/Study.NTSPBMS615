package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Customer;
import com.nt.beans.Employee;
import com.nt.beans.Student;

public class SetterVsConstructorInjectionTest {
	
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com\\nt\\config\\applicationContext.xml");
		
		System.out.println(factory.getBean("emp1", Employee.class));
		System.out.println("---------------------------------------");
		System.out.println(factory.getBean("cust1", Customer.class));
		System.out.println("---------------------------------------");
		System.out.println(factory.getBean("student1", Student.class));
	}

}
