package com.java;

public class Cricketer {
	String cricketer_name;
	int jerseyno;
	int age;
	
	static String country_name="India";
	static String board_name="BCCL";
	
	public static void main(String[] args) {

		Cricketer vk=new Cricketer();
		
		vk.cricketer_name="Virat Kohli";
		vk.jerseyno=18;
		vk.age=37;
		
		System.out.println("Cricketer 1 Details");
		System.out.println("Name          :  "+vk.cricketer_name);
		System.out.println("jersey_no     :  "+vk.jerseyno );
		System.out.println("age           :  "+vk.age);
		System.out.println("country_name  :  "+ country_name);
		System.out.println("board_name    :  "+board_name);
		
        Cricketer RS=new Cricketer();
		
		RS.cricketer_name="Rohit Sharma";
		RS.jerseyno=45;
		RS.age=39;
		
		System.out.println("Cricketer 2 Details");
		System.out.println("Name          :  "+RS.cricketer_name);
		System.out.println("jersey_no     :  "+RS.jerseyno);
		System.out.println("age           :  "+RS.age);
		System.out.println("country_name  :  "+ country_name);
		System.out.println("board_name    :  "+board_name);
		
        Cricketer Gill=new Cricketer();
		
		Gill.cricketer_name="Shubman Gill";
		Gill.jerseyno=77;
		Gill.age=27;
		
		System.out.println("Cricketer 2 Details");
		System.out.println("Name          :  "+Gill.cricketer_name);
		System.out.println("jersey_no     :  "+Gill.jerseyno);
		System.out.println("age           :  "+Gill.age);
		System.out.println("country_name  :  "+ country_name);
		System.out.println("board_name    :  "+board_name);
		
		
	}

}
