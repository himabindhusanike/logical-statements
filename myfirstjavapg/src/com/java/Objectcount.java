package com.java;

public class Objectcount {
	
	static int count=0;
	
	static {
        count++;
	}
	public static void main(String[] args) {
		
//		Objectcount o1= new Objectcount();
//		Objectcount o2= new Objectcount();
		
		System.out.println("count  : "+ count);
	}
}
