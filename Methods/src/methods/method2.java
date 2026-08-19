package methods;
import java.util.Scanner;


public class method2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Id     : ");
		int id =sc. nextInt();
		
		System.out.println("Enter Name   : ");
		String name=sc.next();
		
		System.out.println("id           : "+id);
		System.out.println("Name         : "+name);
		getdetails(100,"bindhu");

		
	}
	static void getdetails(int id,String name) {
		System.out.println("Student Details");
		System.out.println(id);
		System.out.println(name);
		
	}

}
