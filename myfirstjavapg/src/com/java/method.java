package com.java;

public class method {
	
	static {
		method m1=new method();
		m1.method1();	
	}
	
	void method1(){
		System.out.println("Method 1");
		method2();	
	}
	void method2(){
		System.out.println("Method 2");
		method3();
	}

	void method3(){
		System.out.println("Method 3");
		method4();	
	}
	void method4(){
		System.out.println("Method 4");	
	}
	public static void main(String[] args) {
  
	}
}
