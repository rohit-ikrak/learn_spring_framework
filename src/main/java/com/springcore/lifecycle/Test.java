package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/lifecycle/ls_config.xml");
		Samosa s = con.getBean("s1",Samosa.class);
		System.out.println(s);
		//for register shutdown hook we use Abstract Application Context
		con.registerShutdownHook();

		Pepsi p = con.getBean("p1",Pepsi.class);
		System.out.println(p);
		
		Sauce sauce = con.getBean("sauce",Sauce.class);
		System.out.println(sauce);
		
	}
}
