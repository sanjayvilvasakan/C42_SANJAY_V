package com.SANJAY_V.Case_Study_BankingSystem_Group_12;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankingService bankingService = new BankingServicelmpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Banking System Menu:");
            System.out.println("1. Add Customer");
            System.out.println("2. Create Account");
            System.out.println("3. Process Transaction");
            System.out.println("4. Add Beneficiary");
            System.out.println("5. View Customer");
            System.out.println("6. View Account");
            System.out.println("7. View Transaction");
            System.out.println("8. View Beneficiary");
            System.out.println("9. Exit");

            int choice = 0;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 9.");
                sc.next(); 
                continue;
            }

            switch (choice) {
                case 1:
                   
                    System.out.print("Enter Customer ID: ");
                    int customerID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();
                    System.out.print("Enter Contact: ");
                    String contact = sc.nextLine();

                    Customer customer = new Customer(customerID, name, address, contact);
                    bankingService.addCustomer(customer);
                    System.out.println("Customer added successfully.");
                    break;

                case 2:
                  
                    System.out.print("Enter Account ID: ");
                    int accountID = sc.nextInt();
                    System.out.print("Enter Customer ID: ");
                    int accCustomerID = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Account Type: ");
                    String type = sc.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    Account account = new Account(accountID, accCustomerID, type, balance);
                    bankingService.createAccount(account);
                    System.out.println("Account created successfully.");
                    break;

                case 3:
                  
                    System.out.print("Enter Transaction ID: ");
                    int transactionID = sc.nextInt();
                    System.out.print("Enter Account ID: ");
                    int transAccountID = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Transaction Type (Deposit/Withdraw): ");
                    String transType = sc.nextLine();
                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();
                    LocalDateTime timestamp = LocalDateTime.now();

                    Transaction transaction = new Transaction(transactionID, transAccountID, transType, amount, timestamp);
                    bankingService.processTransaction(transaction);
                    System.out.println("Transaction processed successfully.");
                    break;

                case 4:
                
                    System.out.print("Enter Beneficiary ID: ");
                    int beneficiaryID = sc.nextInt();
                    System.out.print("Enter Customer ID: ");
                    int benefCustomerID = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Name: ");
                    String benefName = sc.nextLine();
                    System.out.print("Enter Account Number: ");
                    String accountNumber = sc.nextLine();
                    System.out.print("Enter Bank Details: ");
                    String bankDetails = sc.nextLine();

                    Beneficiary beneficiary = new Beneficiary(beneficiaryID, benefCustomerID, benefName, accountNumber, bankDetails);
                    bankingService.addBeneficiary(beneficiary);
                    System.out.println("Beneficiary added successfully.");
                    break;

                case 5:
            
                    System.out.print("Enter Customer ID: ");
                    int viewCustomerID = sc.nextInt();
                    Customer viewCustomer = bankingService.getCustomer(viewCustomerID);
                    if (viewCustomer != null) {
                        System.out.println(viewCustomer);
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;

                case 6:

                    System.out.print("Enter Account ID: ");
                    int viewAccountID = sc.nextInt();
                    Account viewAccount = bankingService.getAccount(viewAccountID);
                    if (viewAccount != null) {
                        System.out.println(viewAccount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 7:

                    System.out.print("Enter Transaction ID: ");
                    int viewTransactionID = sc.nextInt();
                    Transaction viewTransaction = bankingService.getTransaction(viewTransactionID);
                    if (viewTransaction != null) {
                        System.out.println(viewTransaction);
                    } else {
                        System.out.println("Transaction not found.");
                    }
                    break;

                case 8:
              
                    System.out.print("Enter Beneficiary ID: ");
                    int viewBeneficiaryID = sc.nextInt();
                    Beneficiary viewBeneficiary = bankingService.getBeneficiary(viewBeneficiaryID);
                    if (viewBeneficiary != null) {
                        System.out.println(viewBeneficiary);
                    } else {
                        System.out.println("Beneficiary not found.");
                    }
                    break;

                case 9:
                
                    System.out.println("Exiting the system. Thankyou Visit Again!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 9.");
            }
        }
    }
}

