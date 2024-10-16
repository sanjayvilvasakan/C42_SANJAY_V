package com.SANJAY_V.assignment_6.BankingSystem;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal or insufficient funds");
        }
    }

    public synchronized double getBalance() {
        return balance;
    }
}