package com.java;

public class Bank {
	
	int balance;
	static String bankName="CNB";
	int accountNumber;

	void deposit() {
		balance=balance+500;
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("After deposit   : "+balance);
	}
	
	void withdraw() {
		balance=balance-100;
		System.out.println("After Withdraw  : "+balance);
	}

	void checkbalance() {
		System.out.println("Account Balance : "+balance);
	}
	public static void main(String[] args) {
		
		Bank b1=new Bank();
		b1.accountNumber=10012001;
		b1.balance=5000;
		b1.deposit();
		b1.withdraw();
		b1.checkbalance();
		

	}

}
