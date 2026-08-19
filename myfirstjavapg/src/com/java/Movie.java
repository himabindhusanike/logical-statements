package com.java;

public class Movie {
	
	String moviename;
	
	int Released_year;
	
	double Ticket_Price;

	public static void main(String[] args) {
		
		Movie m1 =new Movie();
		m1.moviename="sira";
		m1.Released_year=2022;
		m1.Ticket_Price=200.0;
		
		Movie m2 =new Movie();
		m2.moviename="pushpa-2";
		m2.Released_year=2023;
		m2.Ticket_Price=250.0;
		
		Movie m3 =new Movie();
		m3.moviename="RRR";
		m3.Released_year=2020;
		m3.Ticket_Price=100.0;
		
		System.out.println("m1 movie details");
		System.out.println("moviename  :  "+m1.moviename);
		System.out.println("Released_year  :  "+m1.Released_year);
		System.out.println("Ticket_Price  :  "+m1.Ticket_Price);
		
		System.out.println("m2 movie details");
		System.out.println("moviename  :  "+m2.moviename);
		System.out.println("Released_year  :  "+m2.Released_year);
		System.out.println("Ticket_Price  :  "+m2.Ticket_Price);
		
		System.out.println("m3 movie details");
		System.out.println("moviename  :  "+m3.moviename);
		System.out.println("Released_year  :  "+m3.Released_year);
		System.out.println("Ticket_Price  :  "+m3.Ticket_Price);
		
		

	}

}
