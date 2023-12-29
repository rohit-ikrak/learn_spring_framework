package com.springcore.auto.wire;

public class B {
	
	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "B [a=" + a + "]";
	}

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	public B(A a) {
		super();
		this.a = a;
	}
	
	

}
