package logicalStatements;

import java.util.Scanner;

public class Onlinevotingsystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter age : ");
		int age=sc.nextInt();
		
		 if (age < 18) {
	            System.out.println("Not Eligible");
	        } 
	        else {

	            System.out.print("Enter Gender  :");
	            char gender = sc.next().charAt(0);
	            
	            if (gender != 'M' && gender != 'F' &&
	                gender != 'm' && gender != 'f') {

	                System.out.println("Not Eligible");
	            } 
	            else {
	            	 System.out.print("Enter VoterId No  : ");
	                 int voterIdNo = sc.nextInt();

	                 System.out.println("Candidates:");
	                 System.out.println("1. Mark Antony");
	                 System.out.println("2. kcr");
	                 System.out.println("3. ktr");
	                 System.out.println("4. pooja");

	                 System.out.print("Press any one option : ");
	                 int option = sc.nextInt();

	                 switch (option) {

	                     case 1:
	                         System.out.println("Vote is Captured for Mark Antony");
	                         break;
	                     case 2:
	                         System.out.println("Vote is Captured for kcr");
	                         break;
	                     case 3:
	                         System.out.println("Vote is Captured for ktr");
	                         break;
	                     case 4:
	                         System.out.println("Vote is Captured for pooja");
	                         break;
	                         
	                     default:
	                         System.out.println("Thanks for Voting To NOTA");
	                 }
	            }
	        }
	}
}
