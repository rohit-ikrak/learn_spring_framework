package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@component("ob") //Use this when you change name of Bean in Test class

@Component
public class Student {
	
	@Value("Rohit Karki")
	private String sName;
	@Value("New Delhi")
	private String scity;
	@Value("#{list}")
	private List<String> address;
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getScity() {
		return scity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	
	public Student(String sName, String scity, List<String> address) {
		super();
		this.sName = sName;
		this.scity = scity;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sName=" + sName + ", scity=" + scity + ", address=" + address + "]";
	}
	
	
}
