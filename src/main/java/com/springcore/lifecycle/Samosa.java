package com.springcore.lifecycle;

//lifecycle of bean using property in xml file
public class Samosa {
	private double price;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Samosa() {
		super();
	}
	@Override
	public String toString() {
		return "Samosa [ price = " + price + " ] ";
	}
	
	public void hey() {
		System.out.println("HEY! Inside init method.");
	}
	public void bye() {
		System.out.println("BYE BYE!!! Inside destroy method.");
	}
}
