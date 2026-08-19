package com.java;

public class StateBank {
	
	String accountHolderName;
	static int accountNumber=1201001;
	double bankBalance;
	static String IFSC="CNB1212000199";
	static String BranchName="Canara Bank";
	{
		accountNumber++;
	}
	public static void main(String[] args) {
		
	   StateBank c1=new StateBank();
	   c1.accountHolderName="Hima Bindhu";
	   c1.bankBalance=20000.0;
	   System.out.println("customer 1 Details");
	   System.out.println("AccountHolderName  : "+ c1.accountHolderName);
	   System.out.println("Account Number     : "+ accountNumber);
	   System.out.println("BankBalance        : "+ c1.bankBalance);
	   System.out.println("IFSC Code          : "+ IFSC);
	   System.out.println("Branch Name        : "+ BranchName);
	   
	   
	   StateBank c2=new StateBank();
	   c2.accountHolderName="Jahnavi";
	   c2.bankBalance=50000.0;System.out.println("customer 2 Details");
	   System.out.println("AccountHolderName  : "+ c2.accountHolderName);
	   System.out.println("Account Number     : "+ accountNumber);
	   System.out.println("BankBalance        : "+ c2.bankBalance);
	   System.out.println("IFSC Code          : "+ IFSC);
	   System.out.println("Branch Name        : "+ BranchName);
	   
	   StateBank c3=new StateBank();
	   c3.accountHolderName="Rohitha";
	   c3.bankBalance=40000.0;
	   System.out.println("customer 3 Details");
	   System.out.println("AccountHolderName  : "+ c3.accountHolderName);
	   System.out.println("Account Number     : "+ accountNumber);
	   System.out.println("BankBalance        : "+ c3.bankBalance);
	   System.out.println("IFSC Code          : "+ IFSC);
	   System.out.println("Branch Name        : "+ BranchName);
	   
	  
	}

}
