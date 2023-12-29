package com.springcore.javaconfig;


public class Student {
	private School school;

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Student(School school) {
		super();
		this.school = school;
	}

	public void study() {
		this.school.display();
		System.out.println("Student is studying");
	}
}
