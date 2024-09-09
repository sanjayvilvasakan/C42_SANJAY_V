package com.SANJAY_V.CaseStudy_BankingApplication;

import java.util.HashMap;
import java.util.Map;

public class BankingServicelmpl implements BankingService {
    private Map<Integer, Customer> customers = new HashMap<>();
    private Map<Integer, Account> accounts = new HashMap<>();
    private Map<Integer, Transaction> transactions = new HashMap<>();
    private Map<Integer, Beneficiary> beneficiaries = new HashMap<>();

    @Override
    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerID(), customer);
    }

    @Override
    public void createAccount(Account account) {
        accounts.put(account.getAccountID(), account);
    }

    @Override
    public void processTransaction(Transaction transaction) {
        transactions.put(transaction.getTransactionID(), transaction);
       
    }

    @Override
    public void addBeneficiary(Beneficiary beneficiary) {
        beneficiaries.put(beneficiary.getBeneficiaryID(), beneficiary);
    }

    @Override
    public Customer getCustomer(int customerID) {
        return customers.get(customerID);
    }

    @Override
    public Account getAccount(int accountID) {
        return accounts.get(accountID);
    }

    @Override
    public Transaction getTransaction(int transactionID) {
        return transactions.get(transactionID);
    }

    @Override
    public Beneficiary getBeneficiary(int beneficiaryID) {
        return beneficiaries.get(beneficiaryID);
    }
}
