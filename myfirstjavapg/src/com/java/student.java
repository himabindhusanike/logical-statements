package com.java;
import java.util.Scanner;

public class student {

	int std_id;
	String std_name;
	int telugu_marks;
	int hindi_marks;
	int english_marks;
	int maths_marks;
	int total_marks;
	double percentage;

	static String college = "CJITS";

	void Total() {
		total_marks = (telugu_marks + hindi_marks + english_marks + maths_marks);

	}

	void percentage() {
		percentage = total_marks / 4;
	}

	void display() {
		System.out.println("student id                  : " + std_id);
		System.out.println("Student Name                : " + std_name);
		System.out.println("college Name                : " + college);
		System.out.println("Telugu Marks                : " + telugu_marks);
		System.out.println("Hindi Marks                 : " + hindi_marks);
		System.out.println("English Marks               : " + english_marks);
		System.out.println("Maths Marks                 : " + maths_marks);
		Total();
		percentage();

		System.out.println("Total Marks of the Student  : " + total_marks);
		System.out.println("Percentage of the Student   : " + percentage);
        System.out.println();
	}

    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        // Student 1
		        student s1 = new student();

		        System.out.println("Enter Student 1 Details");

		        System.out.print("Enter Student ID: ");
		        s1.std_id = sc.nextInt();

		        sc.nextLine(); // Consume newline

		        System.out.print("Enter Student Name: ");
		        s1.std_name = sc.nextLine();

		        System.out.print("Enter English Marks: ");
		        s1.english_marks = sc.nextInt();

		        System.out.print("Enter Telugu Marks: ");
		        s1.telugu_marks = sc.nextInt();

		        System.out.print("Enter Hindi Marks: ");
		        s1.hindi_marks = sc.nextInt();

		        s1.Total();
		        s1.percentage();

		        // Student 2
		        student s2 = new student();

		        System.out.println("\nEnter Student 2 Details");

		        System.out.print("Enter Student ID: ");
		        s2.std_id = sc.nextInt();

		        sc.nextLine(); // Consume newline

		        System.out.print("Enter Student Name: ");
		        s2.std_name = sc.nextLine();

		        System.out.print("Enter English Marks: ");
		        s2.english_marks = sc.nextInt();

		        System.out.print("Enter Telugu Marks: ");
		        s2.telugu_marks = sc.nextInt();

		        System.out.print("Enter Hindi Marks: ");
		        s2.hindi_marks = sc.nextInt();

		        s2.Total();
		        s2.percentage();

		        // Display Details
		        s1.display();
		        s2.display();

		        sc.close();
		    }
}
		
		
//		student s1 = new student();
//		s1.std_id = 1001;
//		s1.std_name = "Hima Bindhu";
//		s1.telugu_marks = 99;
//		s1.hindi_marks = 98;
//		s1.english_marks = 100;
//		s1.maths_marks = 99;
//		s1.display();
//		
//		student s2 = new student();
//		s2.std_id = 1002;
//		s2.std_name = "Jahnavi";
//		s2.telugu_marks = 100;
//		s2.hindi_marks = 100;
//		s2.english_marks = 100;
//		s2.maths_marks = 100;
//		s2.display();


