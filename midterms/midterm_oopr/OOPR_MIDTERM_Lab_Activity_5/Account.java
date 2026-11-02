package com.mycompany.bankingapp;

public abstract class Account {
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