package com.springcore.ci;

public class Person {
	private String name;
	private int personId;
	Certificate cer;

	public Person(String name, int personId, Certificate cer) {
		super();
		this.name = name;
		this.personId = personId;
		this.cer = cer;
	}
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", cer=" + cer + "]";
	}
	
	
	
}
