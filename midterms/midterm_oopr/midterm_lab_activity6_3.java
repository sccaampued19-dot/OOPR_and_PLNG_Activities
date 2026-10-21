package com.mycompany.mavenproject1;
import java.util.Scanner;

public class midterm_lab_activity6_3 {
    
    // Base class
    static class Professor {
        protected String name;
        protected double salary;

        public Professor(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            //getter
            return "Name: " + name + "\n• Salary: " + (int)salary;
        }
    }

    //extends means they are inheriting
    static class Dean extends Professor {
        protected String department;

        public Dean(String name, double salary, String department) {
            super(name, salary);
            this.department = department;
        }

        @Override
        public String toString() {
            return "\n Status\n Rank: Dean\n Name: " + name + "\n Department: " + department + "\n Salary: " + (int)salary;
        }
    }

    static class Executive extends Dean {

        public Executive(String name, double salary, String department) {
            super(name, salary, department);
        }

        @Override
        public String toString() {
            String deanString = super.toString();
            return deanString.replace("Rank: Dean", "Rank: Executive");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {
            System.out.println("\n");
            System.out.println("Are you a Dean or an Executive?");
            System.out.println("1. Dean");
            System.out.println("2. Executive");
            System.out.println("3. Exit Program");
            System.out.print("Enter your choice (1-3): ");
            
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: 
                case 2:
                    System.out.print("\nEnter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine(); 

                    if (choice == 1) {
                        Dean dean = new Dean(name, salary, department);
                        System.out.println(dean);
                    } else {
                        Executive exec = new Executive(name, salary, department);
                        System.out.println(exec);
                    }
                    break;

                case 3:
                    System.out.println("\nExiting application. Goodbye!");
                    break;

                default:
                    System.out.println("\nInvalid choice. Please select 1, 2, or 3.");
                    break;
            }
        }

        scanner.close();
    }
}
