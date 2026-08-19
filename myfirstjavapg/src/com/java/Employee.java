package com.java;

public class Employee {
	
	String empName;
	int empId;
	String designation;
	String department;
	double salary;
	String remoteLocation;
	
	static String comapnyName="Suntech Solutions";
	static String comapnylocation="Hi-TechCity";
	
	static {
		System.out.println("Welcome to SunTech Solutions! Employee HRMS Portal");
		System.out.println();
	}
	
	void displayEmployeeDetails() {
		System.out.println("Employee Name    : "+empName);
		System.out.println("Employee Id      : "+empId);
		System.out.println("designation      : "+designation);
		System.out.println("department       : "+department);
		System.out.println("salary           : "+salary);
		System.out.println("remoteLocation   : "+remoteLocation);
		System.out.println();
	}
	 
	void promoteEmployee() {
		designation="HR Manager";
	}

	void updatesalary() {
		salary=salary+5000;
	}
	void updateEmpLoyeeLocation() {
		remoteLocation="Bangalore";
	}
	public static void main(String[] args) {

		Employee e1=new Employee();
		e1.empName="Hima Bindhu";
		e1.empId=1001;
		e1.designation="Manager";
		e1.department="IT";
		e1.salary=20000;
		e1.remoteLocation="Hyderabad";
		
		e1.displayEmployeeDetails() ;
		
		Employee e2=new Employee();
		e2.empName="pooja";
		e2.empId=1002;
		e2.designation="Developer";
		e2.department="IT";
		e2.salary=40000;
		e2.remoteLocation="Chennai";
		
		e2.displayEmployeeDetails() ;
		
		e1.promoteEmployee();
		e1.updatesalary();
		e1.updateEmpLoyeeLocation(); 
		e1.displayEmployeeDetails() ;
		
	}

}
