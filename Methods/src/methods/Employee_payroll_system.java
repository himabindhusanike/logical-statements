package methods;
import java.util.Scanner;

public class Employee_payroll_system {
	
	    // Instance variables
	    int employeeId;
	    String employeeName;
	    double basicSalary;
	    double hra;
	    double da;
	    double pf;
	    double grossSalary;
	    double netSalary;

	    // Static variables
	    static String companyName = "ABC Technologies";
	    static int totalEmployees;
	    static double totalSalaryPaid;

	    // Method without arguments and without return value
	    void acceptDetails() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Employee ID: ");
	        employeeId = sc.nextInt();

	        System.out.print("Enter Employee Name: ");
	        employeeName = sc.next();

	        System.out.print("Enter Basic Salary: ");
	        basicSalary = sc.nextDouble();

	        totalEmployees++;
	    }

	    // Method without arguments with return value
	    double calculateHRA() {
	        hra = basicSalary * 20 / 100;
	        return hra;
	    }

	    // Method without arguments with return value
	    double calculateDA() {
	        da = basicSalary * 10 / 100;
	        return da;
	    }

	    // Method without arguments with return value
	    double calculatePF() {
	        pf = basicSalary * 5 / 100;
	        return pf;
	    }

	    // Method without arguments with return value
	    double calculateGrossSalary() {
	        grossSalary = basicSalary + calculateHRA() + calculateDA();
	        return grossSalary;
	    }

	    // Method without arguments with return value
	    double calculateNetSalary() {
	        netSalary = calculateGrossSalary() - calculatePF();
	        totalSalaryPaid = totalSalaryPaid + netSalary;
	        return netSalary;
	    }

	    // Method without arguments and without return value
	    void displaySalarySlip() {

	        calculateHRA();
	        calculateDA();
	        calculatePF();
	        calculateGrossSalary();
	        calculateNetSalary();

	        System.out.println("\n----- Employee Salary Slip -----");
	        System.out.println("Company Name  : " + companyName);
	        System.out.println("Employee ID   : " + employeeId);
	        System.out.println("Employee Name : " + employeeName);
	        System.out.println("Basic Salary  : " + basicSalary);
	        System.out.println("HRA           : " + hra);
	        System.out.println("DA            : " + da);
	        System.out.println("PF            : " + pf);
	        System.out.println("Gross Salary  : " + grossSalary);
	        System.out.println("Net Salary    : " + netSalary);
	    }

	    // Static method
	    static void displayCompanyDetails() {

	        System.out.println("\n----- Company Details -----");
	        System.out.println("Company Name       : " + companyName);
	        System.out.println("Total Employees    : " + totalEmployees);
	        System.out.println("Total Salary Paid  : " + totalSalaryPaid);
	    }

	    public static void main(String[] args) {

	    	Employee_payroll_system  e1 = new Employee_payroll_system ();
	    	Employee_payroll_system  e2 = new Employee_payroll_system ();
	    	Employee_payroll_system  e3 = new Employee_payroll_system ();

	        System.out.println("Enter Employee 1 Details");
	        e1.acceptDetails();

	        System.out.println("\nEnter Employee 2 Details");
	        e2.acceptDetails();

	        System.out.println("\nEnter Employee 3 Details");
	        e3.acceptDetails();

	        e1.displaySalarySlip();
	        e2.displaySalarySlip();
	        e3.displaySalarySlip();

	        Employee_payroll_system .displayCompanyDetails();    
	    }
	  
}

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	

	


