package methods;
import java.util.Scanner;

public class Hospital {
	static Scanner sc=new Scanner(System.in);
	String patientName;
	int age;
	
	int Consultationtype;
	String Emergencystatus;
	
	void displayPatient() {
		System.out.println("Enter Patient Name     : ");
		patientName=sc.next();
		System.out.println("Enter age              : ");
		age=sc.nextInt();
		System.out.println("Consultant type        : ");
		Consultationtype=sc.nextInt();
		System.out.println("Emergencystatus        : ");
		Emergencystatus=sc.next();
		System.out.println();
		
	}
	void checkEligibility(int age) {
		if(age<18) {
			System.out.println("status   :Minor Patient");
		}
		else {
			System.out.println("status   :Eligible");
		}	
	}
	double getEmergencyCharge() {
		double emergencycharge;
		if ( Emergencystatus.equalsIgnoreCase(Emergencystatus)) {
			emergencycharge=300;
		}else {
			emergencycharge=0;
		}
		return emergencycharge;
	}
	double calculateFinalFee(int consultation, double emergencyCharge) {
		double consultationfee;
		if(consultation==1) {
			consultationfee=500;
		}else {
			consultationfee=1000;
		}
		double finalFee=consultationfee+ emergencyCharge;
		return finalFee;
	}

	public static void main(String[] args) {
		Hospital h1 =new Hospital();
		
		h1.displayPatient();
		
		h1.checkEligibility(10);
		
		double emergencyCharge = h1.getEmergencyCharge();
		
		double finalFee = h1.calculateFinalFee(
				h1.Consultationtype,
				emergencyCharge);

		System.out.println("Emergency Charge : ₹" + emergencyCharge);
		System.out.println("Final Fee        : ₹" + finalFee);
	}

}
