package com.java;
public class Employeedetails {

	String employee_name;
	int monthly_salary;
	int monthly_GST;
	int monthly_PF;
	int net_monthly_salary;
	
	int annual_GST;
	int annual_PF;
	int annual_Net_salary;
	
	void calculateMonthlyPF() {
		monthly_PF=monthly_salary*2/100;	
	}
	void calculateMonthlyGST() {
		monthly_GST=monthly_salary*3/100;	
	}
	void calculateNetMonthlysalary() {
		net_monthly_salary=monthly_salary-monthly_PF-monthly_GST;	
	}
	void calculateAnnualGST() {
		annual_GST=monthly_GST*12;
	}
	void calculateAnnualPF() {
		annual_PF=monthly_PF*12;
	}
	void calculateAnnualnetsalary() {
		annual_Net_salary=net_monthly_salary*12;
		
	}
	void displayEmployeeDetails() {
		System.out.println("employee_name   : "+employee_name);
		System.out.println("monthly_salary  : "+monthly_salary);
		System.out.println("monthly_GST     : "+monthly_GST);
		System.out.println("monthly_PF      : "+monthly_PF);
		System.out.println("net_monthly_salary : "+net_monthly_salary);
		System.out.println("annual_GST      : "+annual_GST);
		System.out.println("annual_PF       : "+annual_PF);
		System.out.println("annual_Net_salary  : "+annual_Net_salary);
	}
	public static void main(String[] args) {
		
		Employeedetails e1=new Employeedetails();
		e1.employee_name="Hima Bindhu";
		e1.monthly_salary=5000;
		e1.monthly_GST=3;
		e1.monthly_PF=2;
		e1.calculateMonthlyPF();
		e1.calculateMonthlyGST();
		e1.calculateNetMonthlysalary();
		e1.calculateAnnualPF();
		e1.calculateAnnualGST();
		e1.calculateAnnualnetsalary();
		
		e1.displayEmployeeDetails();
		

	}

}
