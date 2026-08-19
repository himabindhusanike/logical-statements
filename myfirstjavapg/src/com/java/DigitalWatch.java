package com.java;

public class DigitalWatch {
	String brandName;
	String watchType;
	int hours;
    int minutes;
    int seconds;
    double price;
    
    void  displayTime() {
    	System.out.println("Updated Time :"+hours+":"+minutes+":"+seconds);
    }
    void updateHour() {
    	hours=hours+1;
    	
    }
    void updateMinutes() {
    	
    	minutes=minutes+5;
    }
    void displaywatchDetails() {
    	System.out.println("brandName   :"+brandName);
    	System.out.println("watchType   :"+watchType);
    	System.out.println("hours       :"+hours);
    	System.out.println("minutes     :"+minutes);
    	System.out.println("seconds     :"+seconds);
    	System.out.println("Price       :"+price);
    	System.out.println();
    
    }

	public static void main(String[] args) {

		DigitalWatch w1=new DigitalWatch();
		System.out.println("************watch 1 details************");
		System.out.println();
		w1.brandName="Casio";
		w1.watchType="Sports";
		w1.hours=5;
		w1.minutes=45;
		w1.seconds=10;
		w1.price=2000;
		w1.displaywatchDetails();
		w1.displayTime();
		
		DigitalWatch w2=new DigitalWatch();
		System.out.println();
		System.out.println("************watch 2 details************");
	
		System.out.println();
		w2.brandName="Noise";
		w2.watchType="Smartwatch";
		w2.hours=6;
		w2.minutes=13;
		w2.seconds=10;
		w2.price=4000;
		
		w2.displaywatchDetails();
		w2.displayTime();
		System.out.println();
//    Watch 1 Time update 
		w1.updateHour();	
		w1.updateMinutes();
//    Watch 2 Time update 
		w2.updateHour();	
		w2.updateMinutes();
		
		System.out.println("After time Updated");
		w1.displayTime();
		w2.displayTime();
	}

}
