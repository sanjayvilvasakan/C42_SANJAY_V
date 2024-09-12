package com.SANJAY_V.assignment_5;

public class BankSystemDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(123456, 500.00);

        try {
            account.displayBalance();

            account.deposit(150.00);
            account.displayBalance();

            account.withdraw(700.00);
            account.displayBalance();

        } catch (InvalidAmountException e) {

            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {

            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Final balance after all transactions:");
            account.displayBalance();
        }

        try {
            
            account.deposit(0.00);  
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }
    }
}