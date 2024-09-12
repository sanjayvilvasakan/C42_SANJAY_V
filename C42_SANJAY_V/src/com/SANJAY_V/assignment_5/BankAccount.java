package com.SANJAY_V.assignment_5;

class BankAccount {
    private int accountNumber;
    private double balance;  

    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero.");
        }
        balance += amount;
        System.out.println("Successfully deposited: $" + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Your balance is: $" + balance);
        }
        balance -= amount;
        System.out.println("Successfully withdrew: $" + amount);
    }

    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }
}
