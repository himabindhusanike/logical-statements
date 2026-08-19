package com.java;
import java.util.Scanner;

public class User{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter amount:");
		int money=sc.nextInt();
		
		System.out.println("cost of pencil:");
		int costofpencil=sc.nextInt();
		
		int a=money/costofpencil;
		int b=money%costofpencil;
		
		
		System.out.println("Totak Amount  :  "+money);
	    System.out.println("Cost of Pencil:  "+costofpencil);
		System.out.println("No of pencils :  " +a);
		System.out.println("Amount left   :  "+b);
	}
}

//public class User {
//	
//	public static void main(String[] args) {
//		
//		int money=100;
//		int costofpencil=7;
//	    int a=money/costofpencil;
//		
//	    System.out.println("Totak Amount  :  "+money);
//	    System.out.println("Cost of Pencil:  "+costofpencil);
//		System.out.println("No of pencils :  " +a);
//		System.out.println("Amount left   :  "+money%costofpencil);
//
//	}
//
//}

  
