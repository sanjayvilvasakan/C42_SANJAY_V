package com.SANJAY_V.Case_Study_BankingSystem_Group_12;

public interface BankingService {
    void addCustomer(Customer customer);
    void createAccount(Account account);
    void processTransaction(Transaction transaction);
    void addBeneficiary(Beneficiary beneficiary);
    Customer getCustomer(int customerID);
    Account getAccount(int accountID);
    Transaction getTransaction(int transactionID);
    Beneficiary getBeneficiary(int beneficiaryID);
}

