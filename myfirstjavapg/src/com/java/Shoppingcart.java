package com.java;
import java.util.Scanner;

public class Shoppingcart {
	
	int items;
	double totalAmount;
	String orderstatus;

	
	static String website="Pizzahut";
	
	void additem() {
		System.out.println();
		
	}
	void placeorder() {
		System.out.println("Order Placed Succesfully ");
		System.out.println();
	}
	void displayCart() {
		System.out.println("Website Name    : "+website);
		System.out.println("number of items : "+items);
		System.out.println("Total Amount    : "+totalAmount);
		System.out.println("Order Status    : "+orderstatus);
		System.out.println();
	}
	
	static void changeWebsite() {
		website="asdfgh";	
	}
    static void displayWebsite() {
    	System.out.println("website name   : "+website);	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Shoppingcart o1=new Shoppingcart();
		System.out.println("********************cart 1******************");
		System.out.println("Enter no of items : ");
		o1.items=sc.nextInt();
		System.out.println("Enter total amount : ");
		o1.totalAmount=sc.nextInt();
		System.out.println("order status  : ");
		o1.orderstatus=sc.next();
		
		System.out.println();
		
		System.out.println("********************cart 2******************");
		Shoppingcart o2=new Shoppingcart();
		System.out.println("Enter no of items : ");
		o2.items=sc.nextInt();
		System.out.println("Enter total amount : ");
		o2.totalAmount=sc.nextInt();
		System.out.println("order status  : ");
		o1.orderstatus=sc.next();
		
		o1.displayCart();
//		o2.changeWebsite();
		o2.displayCart();
		
		
		o1.placeorder();
		o2.displayCart();	

	}

}
