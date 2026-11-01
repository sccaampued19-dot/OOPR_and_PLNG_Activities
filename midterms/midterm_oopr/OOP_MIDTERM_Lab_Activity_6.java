package com.mycompany.ooprproj1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OOP_MIDTERM_Lab_Activity_6 {
    static class BankAccount {
        private double balance;

        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.printf("Successfully withdrew %.2f\n", amount);
            } else {
                System.out.println("Insufficient funds for this withdrawal.");
            }
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.printf("Successfully deposited %.2f\n", amount);
        }

        public double getBalance() {
            return balance;
        }
    }

    static class LabDate {
        int year;
        int month;
        int day;

        public LabDate(int year, int month, int day) {
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
        protected LabDate admissionDate;
        protected String disease;
        protected LabDate dischargeDate;

        public void enterInfo(Scanner scanner) {
            System.out.print("1. Name of the patient: ");
            name = scanner.nextLine();

            System.out.println("2. Date of admission:");
            admissionDate = readDate(scanner);

            System.out.print("3. Disease: ");
            disease = scanner.nextLine();

            System.out.println("4. Date of discharge:");
            dischargeDate = readDate(scanner);
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
            age = readIntInRange(scanner, "5. Age: ", 0, 150);
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

    static class Professor {
        protected String name;
        protected double salary;

        public Professor(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Name: " + name + "\n• Salary: " + (int)salary;
        }
    }

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

    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a whole number.");
                scanner.nextLine();
            }
        }
    }

    private static int readIntInRange(Scanner scanner, String prompt, int min, int max) {
        while (true) {
            int value = readInt(scanner, prompt);
            if (value >= min && value <= max) {
                return value;
            }
            System.out.println("Error: Value must be between " + min + " and " + max + ".");
        }
    }

    private static double readNonNegativeDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                double value = scanner.nextDouble();
                scanner.nextLine();
                if (value >= 0) {
                    return value;
                }
                System.out.println("Error: Value cannot be negative.");
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine();
            }
        }
    }

    private static LabDate readDate(Scanner scanner) {
        int year = readIntInRange(scanner, "   Enter Year: ", 1, 9999);
        int month = readIntInRange(scanner, "   Enter Month (1-12): ", 1, 12);
        int day = readIntInRange(scanner, "   Enter Day (1-31): ", 1, 31);
        return new LabDate(year, month, day);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mainChoice = 0;

        while (mainChoice != 4) {
            System.out.println("\n=============================================");
            System.out.println("             MIDTERM LAB ACTIVITY 6          ");
            System.out.println("=============================================");
            System.out.println("1. Run Activity 6.1 (Bank Account System)");
            System.out.println("2. Run Activity 6.2 (Patient Database System)");
            System.out.println("3. Run Activity 6.3 (Academic Hierarchy Profile)");
            System.out.println("4. Exit");
            System.out.println("=============================================");
            System.out.print("Select a program to execute (1-4): ");

            try {
                mainChoice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\nError: Please enter a valid menu number option selection.");
                scanner.next();
                mainChoice = 0;
                continue;
            }

            switch (mainChoice) {
                case 1:
                    runBankAccountProgram(scanner);
                    break;
                case 2:
                    runPatientDatabaseProgram(scanner);
                    break;
                case 3:
                    runAcademicHierarchyProgram(scanner);
                    break;
                case 4:
                    System.out.println("\nSession terminated.");
                    break;
                default:
                    System.out.println("\nInvalid selection! Restrict choice to (1-4).");
                    break;
            }
        }
        scanner.close();
    }

    private static void runBankAccountProgram(Scanner scanner) {
        double initialBalance = 0;
        System.out.println("\nBank Account");
        System.out.println("Welcome!");

        while (true) {
            try {
                System.out.print("Enter your initial balance: ");
                initialBalance = scanner.nextDouble();
                scanner.nextLine(); 

                if (initialBalance < 0) {
                    System.out.println("Error: Balance cannot be negative. Try again.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input! Characters and strings are not allowed.");
                scanner.nextLine(); 
            }
        }

        BankAccount account = new BankAccount(initialBalance);
        int choice = 0;

        while (choice != 3) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Withdraw Amount");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Return to Main Workspace Selector");

            try {
                System.out.print("Enter selection (1-3): ");
                choice = scanner.nextInt();
                scanner.nextLine(); 
            } catch (InputMismatchException e) {
                System.out.println("\nError: Please enter numbers only.");
                scanner.nextLine();
                choice = 0;
                continue;
            }

            switch (choice) {
                case 1:
                    while (true) {
                        try {
                            System.out.println("\nHow much amount you want to withdraw from your account?");
                            System.out.print("Amount: ");
                            double withdrawAmount = scanner.nextDouble();
                            scanner.nextLine();

                            if (withdrawAmount < 0) {
                                System.out.println("Error: Amount cannot be negative.");
                                continue;
                            }
                            account.withdraw(withdrawAmount);
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Invalid transaction amount format.");
                            scanner.nextLine(); 
                        }
                    }
                    System.out.printf("Your current balance is: %.2f\n", account.getBalance());
                    break;
                
                case 2:
                    while (true) {
                        try {
                            System.out.println("\nHow much amount you want to deposit in your account?");
                            System.out.print("Amount: ");
                            double depositAmount = scanner.nextDouble();
                            scanner.nextLine(); 
                            
                            if (depositAmount < 0) {
                                System.out.println("Error: Amount cannot be negative.");
                                continue;
                            }
                            account.deposit(depositAmount);
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Invalid transaction amount format.");
                            scanner.nextLine(); 
                        }
                    }
                    System.out.printf("Your current balance is: %.2f\n", account.getBalance());
                    break;
                
                case 3:
                    System.out.println("\nThank you for using the system!");
                    break;

                default:
                    System.out.println("\nInvalid selection. Please choose 1, 2, or 3.");
                    break;
            }       
        }       
    }
    
    private static void runPatientDatabaseProgram(Scanner scanner) {
        ArrayList database = new ArrayList<>();
        int choice;
        
        System.out.println("\nPatient Registry");
        
        do {
            System.out.println("\n1. Insert New Patient");
            System.out.println("2. Display all Patients");
            System.out.println("3. Display pediatric patients (< 12 Years)");
            System.out.println("4. Return to Main Workspace Selector");
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
                        for (Object obj : database) {
                            Patient patient = (Patient) obj;
                            patient.displayInfo();
                        }

                    }
                    break;
                    
                case 3:
                    System.out.println("\nPediatric Patients (Less than 12 Years) ");
                    boolean foundPediatric = false;
                        for (Object obj : database) {
                            Patient patient = (Patient) obj;
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
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid option! Please pick 1, 2, 3, or 4.");
                    break;
            }
        } while (choice != 4);
    }
    
    private static void runAcademicHierarchyProgram(Scanner scanner) {
        int choice = 0;
        System.out.println("\nAcademic Hierarchical Roles");
        while (choice != 3) {
            System.out.println("\nAre you a Dean or an Executive?");
            System.out.println("1. Dean");
            System.out.println("2. Executive");
            System.out.println("3. Return to Main Workspace Selector");
            choice = readInt(scanner, "Enter your choice (1-3): ");
            switch (choice) {
                case 1:
                case 2:
                    System.out.print("\nEnter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    double salary = readNonNegativeDouble(scanner, "Enter Salary: ");
                    if (choice == 1) {
                        Dean dean = new Dean(name, salary, department);
                        System.out.println(dean);
                    } else {
                        Executive exec = new Executive(name, salary, department);
                        System.out.println(exec);
                    }
                    break;
                    
                case 3:
                    System.out.println("\nExiting...");
                    break;
                    
                default:
                    System.out.println("\nInvalid choice. Please select 1, 2, or 3.");
                    break;
            }
        }
    }
}