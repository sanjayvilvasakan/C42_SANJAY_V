package com.SANJAY_V.assignment_6.BankingSystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number:");
        String accountNumber = scanner.nextLine();
        System.out.println("Enter initial balance:");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(accountNumber, initialBalance);

        System.out.println("Enter number of transactions:");
        int transactionCount = scanner.nextInt();
        scanner.nextLine(); 

        Thread[] threads = new Thread[transactionCount];

        for (int i = 0; i < transactionCount; i++) {
            System.out.println("Enter transaction type (DEPOSIT or WITHDRAW):");
            String typeInput = scanner.nextLine().toUpperCase();
            TransactionType type = TransactionType.valueOf(typeInput);

            System.out.println("Enter transaction amount:");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            
            threads[i] = new Thread(new Transaction(account, type, amount));
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final Balance: " + account.getBalance());

        scanner.close();
    }
}
