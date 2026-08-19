package com.java;

public class Movieticket {
	
	static String theatreName = "Vishwanath";
	String movieName;
	int seatNumber;
	String booked;
	
	void bookTicket() {
		booked = "booked";
		System.out.println("Ticket is booked");
	}
	void cancleTicket() {
		booked = "cancled";
		System.out.println("Ticket is Cancled");
	}
	void displayTicketDetails() {
		System.out.println("Theatre Name: " + theatreName);
		System.out.println("Movie Name: " +movieName);
		System.out.println("Seat Number: " + seatNumber);
	}
	static void changeTheatreName() {
		theatreName = "HighMax";
	}
	public static void main(String[] args) {
		Movieticket m = new Movieticket();
		System.out.println("***************************************************");
		m.movieName = "Lenin";
		m.seatNumber = 202;
		m.booked = "booked";
		m.displayTicketDetails();
		m.bookTicket();
		System.out.println("***************************************************");
		Movieticket m1 = new Movieticket();
		m1.movieName = "Peddi";
		m1.seatNumber = 105;
		m1.booked = "cancled";
		changeTheatreName();
		m1.displayTicketDetails();
		m1.cancleTicket();
		System.out.println("***************************************************");

	}

}

/*
 *Batch 76- Assignment*

*Java*

movie theatre wants to maintain information about the tickets booked for different movies.
Each ticket has its own movie name,
seat number, and booking status. Since these details are different for every ticket,
The theatre name is common for all movie tickets. If the theatre changes its name, the updated name should be reflected for every ticket.
Design a Java class named "Movieticket to manage the ticket details.
Requirements: -
Create the following variables:
* movieName
- Stores
the name of the movie.
* seatNumber
- stores the seat number allotted to the customer.
* booked
- Stores whether the ticket is booked or not.
* theatreName
- Stores the name of the theatre. Initialize it with

Implement the following methods:
* bookTicket() - Marks the ticket as booked. cancelTicket() - Cancels the ticket booking.
* •displayTicketDetails() - Displays the movie name, seat number, booking status, and theatre name.
* *changeTheatreName()
- Changes the theatre name.
* •displayTheatreName() - Displays the theatre name.
In the "main() method:
> Create two Movieticket objects.
different movie names and seat numbers to each object.
› Display the details of both tickets.
> Book the first ticket.
› Cancel the second ticket.
Change the theatre name using the static method.
› Display the updated details of both tickets.

*MySQL*; -

1. Display the employees who have at least one colleague working in the same department using Exists
2. Display the employees who is not manager to any employee.
3. Display the employees who is earing morethan the avg salary of their own department
 */