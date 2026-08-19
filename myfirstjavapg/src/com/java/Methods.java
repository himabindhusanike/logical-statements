package com.java;

public class Methods {
	
	static void m1() {
		System.out.println("m1 called");
		m2();
	}
	
	static void m2() {
		System.out.println("m2 called");
		Methods m=new Methods();
		m.m3();
		
	}
	
	void m3() {
		System.out.println("m3 called");
		m4();
	}

	void m4() {
		System.out.println("m4 called");

	}
	
	public static void main(String[] args) {
		m1();

	}

}
