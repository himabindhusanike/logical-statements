package logicalStatements;
import java.util.Scanner;

public class HRJobEligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Candidate details

        System.out.print("Enter candidate name: ");
        String name = sc.nextLine();

        System.out.print("Enter qualification: ");
        String qualification = sc.nextLine();

        System.out.print("Enter year of passing: ");
        int yearOfPassing = sc.nextInt();

        System.out.print("Enter number of backlogs: ");
        int backlogs = sc.nextInt();

        System.out.print("Enter percentage: ");
        double percentage = sc.nextDouble();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Do you have technical skills? (yes/no): ");
        String technicalSkills = sc.nextLine();

        System.out.print("Enter communication level (Poor/Good/Excellent): ");
        String communication = sc.nextLine();

        System.out.print("Are you willing to relocate? (yes/no): ");
        String relocation = sc.nextLine();

        System.out.print("Enter experience in years: ");
        double experience = sc.nextDouble();

        System.out.print("Enter notice period in days: ");
        int noticePeriod = sc.nextInt();

        System.out.print("Enter expected salary: ");
        double expectedSalary = sc.nextDouble();

        // Eligibility validation

        if (qualification.equalsIgnoreCase("B.Tech")
                || qualification.equalsIgnoreCase("B.E")
                || qualification.equalsIgnoreCase("MCA")
                || qualification.equalsIgnoreCase("M.Sc")) {

            if (yearOfPassing == 2026) {

                if (backlogs == 0) {

                    if (percentage >= 60) {

                        if (age >= 21 && age <= 30) {

                            if (technicalSkills.equalsIgnoreCase("yes")) {

                                if (communication.equalsIgnoreCase("Good")
                                        || communication.equalsIgnoreCase("Excellent")) {

                                    if (relocation.equalsIgnoreCase("yes")) {

                                        if (experience >= 0 && experience <= 2) {

                                            if (noticePeriod <= 30) {

                                                if (expectedSalary <= 500000) {

                                                    System.out.println();
                                                    System.out.println("----- Candidate Details -----");
                                                    System.out.println("Name            : " + name);
                                                    System.out.println("Qualification   : " + qualification);
                                                    System.out.println("Year of Passing : " + yearOfPassing);
                                                    System.out.println("Backlogs        : " + backlogs);
                                                    System.out.println("Percentage      : " + percentage);
                                                    System.out.println("Age             : " + age);
                                                    System.out.println("Technical Skill : " + technicalSkills);
                                                    System.out.println("Communication   : " + communication);
                                                    System.out.println("Relocation      : " + relocation);
                                                    System.out.println("Experience      : " + experience);
                                                    System.out.println("Notice Period   : " + noticePeriod);
                                                    System.out.println("Expected Salary : " + expectedSalary);

                                                    System.out.println();
                                                    System.out.println("Result : Candidate is Eligible");

                                                } else {
                                                    System.out.println("Not Eligible");
                                                    System.out.println("Reason: Expected salary is above company range.");
                                                }

                                            } else {
                                                System.out.println("Not Eligible");
                                                System.out.println("Reason: Notice period should be 30 days or less.");
                                            }

                                        } else {
                                            System.out.println("Not Eligible");
                                            System.out.println("Reason: Experience should be between 0 and 2 years.");
                                        }

                                    } else {
                                        System.out.println("Not Eligible");
                                        System.out.println("Reason: Candidate should be willing to relocate.");
                                    }

                                } else {
                                    System.out.println("Not Eligible");
                                    System.out.println("Reason: Communication skill should be Good or Excellent.");
                                }

                            } else {
                                System.out.println("Not Eligible");
                                System.out.println("Reason: Candidate should have technical skills.");
                            }

                        } else {
                            System.out.println("Not Eligible");
                            System.out.println("Reason: Age should be between 21 and 30.");
                        }

                    } else {
                        System.out.println("Not Eligible");
                        System.out.println("Reason: Percentage should be 60% or above.");
                    }

                } else {
                    System.out.println("Not Eligible");
                    System.out.println("Reason: Candidate should not have active backlogs.");
                }

            } else {
                System.out.println("Not Eligible");
                System.out.println("Reason: Candidate should be a 2026 graduate.");
            }

        } else {
            System.out.println("Not Eligible");
            System.out.println("Reason: Qualification should be B.Tech, B.E, MCA or M.Sc.");
        }

        sc.close();
    }
}