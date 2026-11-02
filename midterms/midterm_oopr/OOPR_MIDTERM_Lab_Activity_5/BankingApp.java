package com.mycompany.bankingapp;
import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===========================================");
        System.out.println("||   Welcome to the OOP Banking System   ||");
        System.out.println("===========================================");
        System.out.print("\nOpening balance: ");
        double initialBalance = readNonNegativeBalance(scanner);

        SavingsAccount savingsAccount = new SavingsAccount("SA-001", initialBalance);
        CheckingAccount checkingAccount = new CheckingAccount("CA-001", initialBalance);

        Account selectedAccount = savingsAccount;

        boolean running = true;
        while (running) {
            printAccountSummary(selectedAccount);
            showMenu();
            
            System.out.print("Choice: ");
            String input = scanner.nextLine().trim();

            switch (input) {
                case "1": 
                    System.out.print("Amount to withdraw: PHP ");
                    double withdrawAmt = readPositiveAmount(scanner);
                    if (withdrawAmt > 0) {
                        selectedAccount.withdraw(withdrawAmt);
                    }
                    break;

                case "2": 
                    System.out.print("Amount to deposit: PHP ");
                    double depositAmt = readPositiveAmount(scanner);
                    if (depositAmt > 0) {
                        selectedAccount.deposit(depositAmt);
                    }
                    break;

                case "3":
                    break;

                case "4":
                    if (selectedAccount == savingsAccount) {
                        selectedAccount = checkingAccount;
                    } else {
                        selectedAccount = savingsAccount;
                    }
                    break;

                case "5": 
                    System.out.println("Thank you for using the system!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please choose an option from 1 to 5.");
                    break;
            }
            System.out.println(); 
        }
        scanner.close();
    }

    public static void showMenu() {
        System.out.println("[1] Withdraw \n[2] Deposit \n[3] Show balance \n[4] Switch account \n[5] Exit");
    }

    public static double readNonNegativeBalance(Scanner scanner) {
        while (true) {
            try {
                double val = Double.parseDouble(scanner.nextLine());
                if (val >= 0) {
                    return val;
                }
                System.out.print("Invalid balance. Enter zero or more: ");
            } catch (NumberFormatException e) {
                System.out.print("Invalid numeric input. Try again: ");
            }
        }
    }

    public static double readPositiveAmount(Scanner scanner) {
        try {
            double val = Double.parseDouble(scanner.nextLine());
            if (val > 0) {
                return val;
            }
            System.out.println("Error: Amount must be greater than zero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        }
        return -1; 
    }

    public static void printAccountSummary(Account account) {
        System.out.printf("Current account: %s \nBalance: PHP %.2f\n", 
                account.getAccountType(), account.getBalance());
    }
}