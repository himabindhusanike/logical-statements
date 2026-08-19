package com.java;

public class Courier {
	String customerName;
	int courierid;
	String source;
	String destination;
	double weight;
	double delivery_amount;
	
	static int totalcouriers;
	static double totalweight;
	static double totalamountcollected;
	static int priceperkg=100;
	
	static {
		System.out.println("Welcome to Quickship Courier!");
		System.out.println();
	}

	void bookcourier() {
		delivery_amount=weight*priceperkg;
		totalcouriers=totalcouriers+1;
		totalweight=totalweight+weight;
	    totalamountcollected=totalamountcollected+delivery_amount;
	    System.out.println("Your order has been booked successfully");
	    System.out.println();
	}
	
	void displayCourierDetails() {
		System.out.println("customerName    : "+customerName);
		System.out.println("courierid       : "+courierid);
		System.out.println("source          : "+source);
		System.out.println("destination     : "+destination);
		System.out.println("weight          : "+weight);
		System.out.println("delivery_amount : "+delivery_amount);
		System.out.println();
	}
	
	static void displayTodayscollection() {
		System.out.println("totalcouriers   : "+totalcouriers);
		System.out.println("totalweight     : "+totalweight);
		System.out.println("totalamountcollected :" +totalamountcollected);
		System.out.println();
		
	}
	public static void main(String[] args) {
		Courier c1=new Courier();
		c1.customerName="Bindhu";
		c1.courierid=1001;
		c1.source="KPHB";
		c1.destination="MIYAPUR";
		c1.weight=1;
//		c1.delivery_amount=100;
		
		Courier c2=new Courier();
		c2.customerName="vamshi";
		c2.courierid=1002;
		c2.source="KPHB";
		c2.destination="kukatpally";
		c2.weight=3;
//		c2.delivery_amount=150;
		
		c1.bookcourier();
		c1.displayCourierDetails();
		
		c2.bookcourier();
		c2.displayCourierDetails();
		
		displayTodayscollection();



	}

}
