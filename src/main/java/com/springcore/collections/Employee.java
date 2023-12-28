package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private String name;
	private List<String> phones;
	private Set<String> address;
	private Map<String, String> courses;
	Properties p = new Properties();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Properties getP() {
		return p;
	}
	public void setP(Properties p) {
		this.p = p;
	}
	public Employee(String name, List<String> phones, Set<String> address, Map<String, String> courses, Properties p) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
		this.p = p;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phones=" + phones + ", address=" + address + ", courses=" + courses
				+ ", p=" + p + "]";
	}
	
}
