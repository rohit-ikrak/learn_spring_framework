package com.springcore.javaconfig;

public class School {
	private String schoolName;

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + "]";
	}

	public School(String schoolName) {
		super();
		this.schoolName = schoolName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public void display() {
		System.out.println("The student goes to " + schoolName);
	}

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
