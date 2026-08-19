package com.java;

public class Restaurant_Dining_Tables {
	 
	int table_number;
	int seats;
	boolean reserved;
	
	
	static String restaurant_name="ABCD";
	
	void reserve_table(){
		reserved=true;	
	}
	void cancel_Reservation() {
		reserved=false;	
	}
	void display_table_details() {
		System.out.println("Restaurant Name   : "+restaurant_name);
		System.out.println("Table Number      : "+table_number);
		System.out.println("No of Seats       : "+seats);
		System.out.println("Reservation status: "+reserved);
		System.out.println();
	}
	static void changeRestaurantName() {
		restaurant_name="xyz";
		
	}
	static void displayRestaurantName() {
		System.out.println(restaurant_name);
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		Restaurant_Dining_Tables table1=new Restaurant_Dining_Tables();
		table1.table_number=101;
		table1.seats=5;
		table1.reserved=true;
		table1.reserve_table();
		table1.display_table_details();
		
		Restaurant_Dining_Tables table2=new Restaurant_Dining_Tables();
		table2.table_number=102;
		table2.seats=10;
		table2.reserved=false;
		table2.changeRestaurantName();
		table2.display_table_details();
		
		Restaurant_Dining_Tables.displayRestaurantName();
		
		// Display Table Details
        System.out.println("***** Table 1 Details *****");
        table1.display_table_details();

        System.out.println("***** Table 2 Details *****");
        table2.display_table_details();
        
        table1.reserve_table();
        table2.cancel_Reservation();

        Restaurant_Dining_Tables.changeRestaurantName();
        
        Restaurant_Dining_Tables.displayRestaurantName();
        
        // Display Updated Details
        System.out.println("***** Updated Table 1 Details *****");
        table1.display_table_details();

        System.out.println("***** Updated Table 2 Details *****");
        table2.display_table_details();
        


	}

}
