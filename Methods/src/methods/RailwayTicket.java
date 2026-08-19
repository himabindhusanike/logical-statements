package methods;
import java.util.Scanner;

public class RailwayTicket {
	String PassengerName;
	int age;
	double distance;
    int classType;
    int Concession;

    void displayPassenger() {
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.print("Enter passengername    :");
    	PassengerName=sc.next();
    	
    	System.out.println("Enter age            :");
    	age=sc.nextInt();
    	
    	System.out.println("Enter distance       :");
    	distance=sc.nextDouble();
    	
    	System.out.println("Enter class Type     :");
    	classType=sc.nextInt();
    
    	
    	System.out.println();
    	sc.close();
    }
    void checkConcession(int age) {

    	    if (age < 5) {
    	        Concession = 100;
    	        System.out.println("Concession : 100% (Free Ticket)");
    	    }
    	    else if (age <= 12) {
    	        Concession = 50;
    	        System.out.println("Concession : 50%");
    	    }
    	    else if (age < 60) {
    	        Concession = 0;
    	        System.out.println("Concession : 0%");
    	    }
    	    else {
    	        Concession = 40;
    	        System.out.println("Concession : 40%");
    	    }
    }
    double getRate() {
    	double rate;
    	if(classType==1) {
    		rate=2;	
    	}else if(classType==2){
    		rate=5;	
    	}else {
    		rate=8;
    	}
    	return rate;
    
    }
    double calculateFinalFare(double rate,int distance) {
    	
    	   double finalFare=rate*distance;
    	   finalFare=finalFare-(finalFare*Concession/100);
  
    	   if(distance>500) {
    		finalFare=finalFare-(finalFare*10/100);
    	   }
          	return finalFare;
    }
    void displayresults() {
    	System.out.println("Passenger Details");
    	System.out.println("Passenger Name    : "+PassengerName);
    	System.out.println("age               : "+age);
    	System.out.println("distance          : "+distance);
    	System.out.println("class type        : "+classType);
    	System.out.println("Concession        : "+Concession);
    	System.out.println();
    }

	public static void main(String[] args) {
		RailwayTicket t1=new RailwayTicket();
		
		t1.displayPassenger();
		
		t1.checkConcession(t1.age);
		double rate=t1.getRate();
		double finalFare=t1.calculateFinalFare(rate,(int)t1.distance);
		t1.displayresults();
		
		System.out.println("rate        :"+rate);
		
		System.out.println("finalFare   :"+finalFare);

	}

}

//Create a Java class RailwayTicket.
//
//Take the following inputs using Scanner:
//
//Passenger Name
//Age
//Distance
//Class Type
//
//Class Type:
//
//1 → Sleeper
//2 → AC
//3 → First Class
//
//Create exactly 4 methods, one for each type of method:
//
//No Return + No Parameters
//displayPassenger()
//No Return + With Parameters
//checkConcession(int age)
//Return + No Parameters
//getRate()
//Return + With Parameters
//calculateFinalFare(double rate, int distance)
//
//Use if-else for these conditions:
//
//Age below 5 → Free
//Age 5–12 → 50% concession
//Age 13–59 → No concession
//Age 60 or above → 40% concession
//
//Class rates:
//
//Sleeper → ₹2/km
//AC → ₹5/km
//First Class → ₹8/km
//
//Additional condition:
//
//If distance is more than 500 km → additional 10% discount.
//Otherwise → no additional discount.
//
//Call all four methods from main() and display the final fare.
