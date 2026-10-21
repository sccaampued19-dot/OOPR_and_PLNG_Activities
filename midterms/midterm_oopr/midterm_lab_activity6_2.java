package com.mycompany.mavenproject1;
import java.util.ArrayList;
import java.util.Scanner;

public class midterm_lab_activity6_2 {
    static class Date {
        int year;
        int month;
        int day;
        
        //constructor
        public Date(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        @Override
        public String toString() {
            return year + "/" + month + "/" + day;
        }
    }

    static class PatientBase {
        protected String name;
        protected Date admissionDate;
        protected String disease;
        protected Date dischargeDate;

        public void enterInfo(Scanner scanner) {
            System.out.print("1. Name of the patient: ");
            name = scanner.nextLine();

            System.out.println("2. Date of admission:");
            System.out.print("   Enter Year: ");
            int ay = scanner.nextInt();
            System.out.print("   Enter Month: ");
            int am = scanner.nextInt();
            System.out.print("   Enter Day: ");
            int ad = scanner.nextInt();
            admissionDate = new Date(ay, am, ad);
            scanner.nextLine(); 

            System.out.print("3. Disease: ");
            disease = scanner.nextLine();

            System.out.println("4. Date of discharge:");
            System.out.print("   Enter Year: ");
            int dy = scanner.nextInt();
            System.out.print("   Enter Month: ");
            int dm = scanner.nextInt();
            System.out.print("   Enter Day: ");
            int dd = scanner.nextInt();
            dischargeDate = new Date(dy, dm, dd);
            scanner.nextLine(); 
        }

        public void displayInfo() {
            System.out.println("Patient Name: " + name);
            System.out.println("Date of Admission: " + admissionDate);
            System.out.println("Disease: " + disease);
            System.out.println("Date of Discharge: " + dischargeDate);
        }
    }

    static class Patient extends PatientBase {
        private int age;

        @Override
        public void enterInfo(Scanner scanner) {
            super.enterInfo(scanner);
            System.out.print("5. Age: ");
            age = scanner.nextInt();
            scanner.nextLine();
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Age: " + age);
            System.out.println("----------------------------------------");
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Patient> database = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n");
            System.out.println("1. Insert New Patient");
            System.out.println("2. Display all Patient");
            System.out.println("3. Display pediatric patient");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid number choice.");
                scanner.next();
                System.out.print("Enter choice: ");
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Patient p = new Patient();
                    p.enterInfo(scanner);
                    database.add(p);
                    System.out.println("Patient added successfully!");
                    break;

                case 2:
                    System.out.println("\nAll Patients:");
                    if (database.isEmpty()) {
                        System.out.println("No records found.");
                    } else {
                        for (Patient patient : database) {
                            patient.displayInfo();
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nPediatric Patients (Less than 12 Years) ");
                    boolean foundPediatric = false;
                    for (Patient patient : database) {
                        if (patient.getAge() < 12) {
                            patient.displayInfo();
                            foundPediatric = true;
                        }
                    }
                    if (!foundPediatric) {
                        System.out.println("No pediatric patients found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting application.");
                    break;

                default:
                    System.out.println("Invalid option! Please pick 1, 2, 3, or 4.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
