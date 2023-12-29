package com.springcore.auto.wire;

public class A {
	private String val;

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "A [val=" + val + "]";
	}

	public A(String val) {
		super();
		this.val = val;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}
	
	
}
