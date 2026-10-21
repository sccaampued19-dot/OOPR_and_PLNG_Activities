package com.mycompany.mavenproject1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class midterm_lab_activity6_1 {
    //encapsulation
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
            //getter
            return balance;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double initialBalance = 0;

        System.out.println("Welcome!");

        while (true) {
            try {
                System.out.print("Enter your initial balance: ");
                initialBalance = scanner.nextDouble();
                
                if (initialBalance < 0) {
                    System.out.println("Error: Balance cannot be negative. Try again.");
                    continue; 
                }
                break; 
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input! Characters and strings are not allowed.");
                scanner.next(); 
            }
        }

        BankAccount account = new BankAccount(initialBalance);
        int choice = 0;

        while (choice != 3) {
            // menu
            System.out.println("\n");
            System.out.println("Select an option:");
            System.out.println("1. Withdraw Amount");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Exit");

            try {
                System.out.print("Enter selection (1-3): ");
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nError: Please enter numbers only.");
                scanner.next(); 
                choice = 0; 
                continue;
            }

            switch (choice) {
                case 1: //withdraw
                    while (true) {
                        try {
                            System.out.println("\nHow much amount you want to withdraw from your account?");
                            System.out.print("Amount: ");
                            double withdrawAmount = scanner.nextDouble();
                            
                            if (withdrawAmount < 0) {
                                System.out.println("Error: Amount cannot be negative.");
                                continue;
                            }
                            account.withdraw(withdrawAmount);
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Invalid transaction amount format.");
                            scanner.next(); 
                        }
                    }
                    System.out.printf("Your current balance is: %.0f\n", account.getBalance());
                    break;

                case 2: //deposit
                    while (true) {
                        try {
                            System.out.println("\nHow much amount you want to deposit in your account?");
                            System.out.print("Amount: ");
                            double depositAmount = scanner.nextDouble();
                            
                            if (depositAmount < 0) {
                                System.out.println("Error: Amount cannot be negative.");
                                continue;
                            }
                            account.deposit(depositAmount);
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Invalid transaction amount format.");
                            scanner.next(); 
                        }
                    }
                    System.out.printf("Your current balance is: %.0f\n", account.getBalance());
                    break;

                case 3: //exit
                    System.out.println("\nThank you for using the system!");
                    break;

                default: //invalid
                    System.out.println("\nInvalid selection. Please choose 1, 2, or 3.");
                    break;
            }
        }

        scanner.close();
    }
}
