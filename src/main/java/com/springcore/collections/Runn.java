package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runn {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/Emp-config.xml");
		Employee emp1 = (Employee) context.getBean("emp1");
		System.out.println(emp1);
	}

}
