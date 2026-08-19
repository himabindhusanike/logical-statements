package com.java;

public class ATM {

	static String bankName="Canara Bank";

	int accountNumber;
	int balance=2000;
	
    void deposit(){
    	
    	balance=balance+100;
    	System.out.println("After Deposit Balance : " + balance);
	}
	void withdraw() {
		balance=balance-100;
		System.out.println("After Withdraw Balance : " + balance);
		
	}
	void checkBalance() {
		 System.out.println("Bank Name             : " + bankName);
		 System.out.println("Account Number        : " + accountNumber);
		 System.out.println("Balance               : " + balance);
		 System.out.println();
		
	}

	public static void main(String[] args) {
		
		ATM a1= new ATM();
		a1.accountNumber=1001201;
	
	    a1.deposit();
	    a1.withdraw();
	    a1.checkBalance();
		
		ATM a2= new ATM();
		a2.accountNumber=1001202;

	    a2.deposit();
	    a2.withdraw();
	    a2.checkBalance();

	}

}
