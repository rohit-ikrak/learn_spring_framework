package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// lifecycle of bean using interfaces
public class Pepsi implements InitializingBean, DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void destroy() throws Exception {
		System.out.println("Imma gonna destroy this object now...BYE!!!.");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("HEY! Imma inside the process now...init...");
	}
	
	
}
