package com.springcore.auto.wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class B {
	@Autowired
	@Qualifier("a2")
	private A a;

	public A getA() {
		return a;
	}
	//@Autowired
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
	//@Autowired
	public B(A a) {
		super();
		this.a = a;
	}
	
	

}
