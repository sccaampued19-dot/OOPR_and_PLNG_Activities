package com.mycompany.ooprproj1;
import java.util.Scanner;

public class OOPR_MIDTERM_Lab_Activity_5 {
    public static abstract class Account {
        private String accountNumber;
        private double balance;

        public Account(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public abstract double calculateWithdrawalFee();
        public abstract String getAccountType();

        public boolean deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Error: Deposit amount must be positive.");
                return false;
            }
            this.balance += amount;
            System.out.printf("New %s balance: PHP %.2f\n", getAccountType(), this.balance);
            return true;
        }

        public boolean withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Error: Withdrawal amount must be positive.");
                return false;
            }

            double fee = calculateWithdrawalFee();
            if (this.balance < (amount + fee)) {
                System.out.println("Error: Insufficient funds. (Required: PHP " + String.format("%.2f", amount + fee) + ")");
                return false;
            }

            this.balance -= (amount + fee);
            System.out.printf("Withdrawal fee: PHP %.2f \nNew %s balance: PHP %.2f\n", fee, getAccountType(), this.balance);
            return true;
        }
    }
    
    public static class SavingsAccount extends Account {
        public SavingsAccount(String accountNumber, double balance) {
            super(accountNumber, balance);
        }

        @Override
        public double calculateWithdrawalFee() {
            return 0.0;
        }

        @Override
        public String getAccountType() {
            return "Savings";
        }
    }

    public static class CheckingAccount extends Account {
        public CheckingAccount(String accountNumber, double balance) {
            super(accountNumber, balance);
        }

        @Override
        public double calculateWithdrawalFee() {
            return 10.0;
        }

        @Override
        public String getAccountType() {
            return "Checking";
        }
    }

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