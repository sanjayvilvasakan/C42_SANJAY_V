package com.SANJAY_V.assignment_6.BankingSystem;

public class Transaction implements Runnable {
    private BankAccount account;
    private TransactionType type;
    private double amount;

    public Transaction(BankAccount account, TransactionType type, double amount) {
        this.account = account;
        this.type = type;
        this.amount = amount;
    }

    @Override
    public void run() {
        switch (type) {
            case DEPOSIT:
                account.deposit(amount);
                break;
            case WITHDRAW:
                account.withdraw(amount);
                break;
        }
    }
}