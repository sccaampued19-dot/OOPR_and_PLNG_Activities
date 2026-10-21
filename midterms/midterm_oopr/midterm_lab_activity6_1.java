package com.mycompany.mavenproject1;
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

        System.out.println("Welcome!");
        System.out.print("Enter your initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(initialBalance);

        int choice = 0;

        while (choice != 3) {
            // menu
            System.out.println("\n");
            System.out.println("Select an option:");
            System.out.println("1. Withdraw Amount");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Exit");
            System.out.print("Enter selection (1-3): ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1: //withdraw
                    System.out.println("\nHow much amount you want to withdraw from your account?");
                    System.out.print("Amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    System.out.printf("Your current balance is: %.0f\n", account.getBalance());
                    break;

                case 2: //deposit
                    System.out.println("\nHow much amount you want to deposit in your account?");
                    System.out.print("Amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
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
