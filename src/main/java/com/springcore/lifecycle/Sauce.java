package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//lifecycle of bean using annotations

public class Sauce {
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Sauce(String brand) {
		super();
		this.brand = brand;
	}

	public Sauce() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Sauce [brand=" + brand + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting method.");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Ending method.");
	}
	
}
