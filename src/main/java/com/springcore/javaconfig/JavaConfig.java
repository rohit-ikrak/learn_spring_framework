package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//Instead of using componentscan we can use bean annotation
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
	@Bean
	public School getSchool() {
		School school = new School("DPS");
		return school;
	}
	@Bean(name = {"s", "temp", "stud"})
	public Student getStudent() {
		Student s = new Student(getSchool());
		return s;
	}
}
