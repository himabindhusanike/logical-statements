package methods;

public class Empdetails {
	String EmployeeName;
	double Salary;
	String Companyname;
	
//	Empdetails(String EmployeeName,double Salary,String Companyname){
//		System.out.println("constructor called");
//		this.EmployeeName=EmployeeName;
//		this.Salary=Salary;
//		this.Companyname=Companyname;
//	}

	public static void main(String[] args) {
//		Empdetails e1=new Empdetails("bindhu",40000.00,"abc");
//		e1.display();
		Empdetails e1=new Empdetails();
		e1.EmployeeInfo("bindhu",250000, "xyz");
		//e1.display();
		

	}
	
	void display() {
		System.out.println("Employee Name   : "+EmployeeName);
		System.out.println("Employee Salary : "+Salary);
		System.out.println("Company Name    : "+Companyname);
	}	
	
	void EmployeeInfo(String EmployeeName,double Salary,String Companyname) {
		System.out.println(" by using method");
//		this.Companyname=Companyname;
//		this.EmployeeName=EmployeeName;
//		this.Salary=Salary;
		System.out.println("Employee Name   : "+EmployeeName);
		System.out.println("Employee Salary : "+Salary);
		System.out.println("Company Name    : "+Companyname);
		
	}
}
