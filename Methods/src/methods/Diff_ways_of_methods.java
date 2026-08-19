package methods;
import java.util.Scanner;

public class Diff_ways_of_methods {
	// Instance variables
	int emp_ID;
	String emp_name;
	long phone_number;
	float experience;
	double basic_salary;
	String emp_grade;
	boolean Permanent_employee_status;
	double HRA;
	double DA;
	double PF;
	double Bonus;
	double Gross_salary;
	double Net_salary;
	
	// static variables
	static String Company_name ="Vcube";
	static int Total_employees;
	static double Total_salary_paid;
	
	void acceptDetails() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Id            :");
		emp_ID =sc.nextInt();
		
		System.out.print("name          : ");
		emp_name=sc.next();
		
		System.out.print("phonenumber   : ");
		phone_number=sc.nextLong();
		
		System.out.print("experience    : ");
		experience=sc.nextFloat();
		
		System.out.print("basic salary  : ");
		basic_salary =sc.nextDouble();
		
		System.out.print("emp grade     : ");
		emp_grade=sc.next();
		
		System.out.print("Permanent_employee_status   : ");
		Permanent_employee_status=sc.nextBoolean();	
		
		System.out.println();
		
		Total_employees++;
		sc.close();
	}
	double HRA(double salary) {
	    HRA = salary * 20 / 100;
	    return HRA;
	}
	void DA() {
		DA=basic_salary*10/100;
		System.out.println("DA            : "+DA);
		System.out.println();
	}
	void Bonus(double salary) {
		Bonus=basic_salary*10/100;
		System.out.println("Bonus         : "+Bonus);
		System.out.println();
	}
   double PF() {
	    PF = basic_salary * 5 / 100;
	    System.out.println("PF            : " + PF);
	    System.out.println();
	    return PF;
	    
	}
	void Gross_salary() {
		Gross_salary=basic_salary+HRA+DA+Bonus;
		System.out.println("Gross_salary  : "+Gross_salary);	
		System.out.println();
	}
	void Net_salary() {
		Net_salary=Gross_salary-PF;
		System.out.println("Net_salary    : "+Net_salary);
		System.out.println();
		Total_salary_paid = Total_salary_paid + Net_salary;
		
	}
	
	void DisplayDetails() {
		System.out.println("Id                   : "+emp_ID);
		System.out.println("Name                 : "+emp_name);
		System.out.println("Phone Number         : "+phone_number);
		System.out.println("Experience           : "+experience);
		System.out.println("basic_salary         : "+basic_salary);
		System.out.println("emp grade            : "+emp_grade);
		System.out.println("Permanent_employee_status     : "+Permanent_employee_status);
		System.out.println();
	}

	public static void main(String[] args) {
		
		System.out.println("Company   " + Company_name);
		System.out.println();
		
		Diff_ways_of_methods e1=new  Diff_ways_of_methods();
		System.out.println("Employee 1 Details");
		System.out.println();
		e1.acceptDetails();
		
		e1.DisplayDetails();
		
		e1.DA();
		e1.Bonus(e1.basic_salary);
		
		e1.Gross_salary();
		e1.Net_salary();
		double hraAmount = e1.HRA(e1.basic_salary);

		System.out.println("HRA : " + hraAmount);
		
		double pfAmount = e1.PF();

		System.out.println("PF : " + pfAmount);
		
		System.out.println("Total Employees   : " + Total_employees);
		System.out.println("Total Salary Paid : " + Total_salary_paid);
	}
}
