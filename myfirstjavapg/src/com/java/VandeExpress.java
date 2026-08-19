package com.java;

public class VandeExpress {
	String passengerName;
	int age;
	String source;
	String destination;
	int numberofTickets;
	
	static int totalTicketsBought;
	static int price=100;
	static int totalamount;
	
	static {
		System.out.println("Welcome to Vande Express thank you for choosing us");
		System.out.println();
	}
	 void bookTicket() {
		 int ticketamount=numberofTickets*price;
		
		 totalTicketsBought=totalTicketsBought+numberofTickets;
		 
		 totalamount=totalamount*ticketamount;
		 
		 System.out.println("Your ticket has been booked"); 
		 System.out.println();
	 }
	 void displayBookingDetails() {
		 System.out.println("Passenger Name      : "+passengerName);
		 System.out.println("Age                 : "+age);
		 System.out.println("Source              : "+source);
		 System.out.println("Destination         : "+destination);
		 System.out.println("No of Tickets       : "+numberofTickets);
		// System.out.println("ticket amount       : "+ticketamount);
		 System.out.println();
		 
	 }
	 static void ticketCounter() {
		 System.out.println("Total tickets booked by all passengers. : "+totalTicketsBought);
		 System.out.println("Total amount collected                  : "+totalamount);
		 System.out.println();
		 
	 }

	public static void main(String[] args) {
		VandeExpress t1=new VandeExpress();
		
		t1.passengerName="Bindhu";
		t1.age=22;
		t1.source="secunderabad";
		t1.destination="warangal";
		t1.numberofTickets=4;
		t1.bookTicket();
		t1.displayBookingDetails();
	
		VandeExpress t2=new VandeExpress();
		t2.passengerName="Pooja";
		t2.age=28;
		t2.source="secunderabad";
		t2.destination="Mumbai";
		t2.numberofTickets=2;
		
		t2.displayBookingDetails();
		
		ticketCounter();
			
		
	}

}
