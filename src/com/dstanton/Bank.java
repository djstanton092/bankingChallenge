package com.dstanton;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank (String name) {
        this.name = name;
        branches = new ArrayList<Branch> ();
    }

    public boolean addBranch(String name) {
        Branch aBranch = findBranch(name);

        if (aBranch == null) {
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (Branch aBranch: branches) {
            if (aBranch.getName().equalsIgnoreCase(branchName)) {
                return aBranch;
            }
        }
        return null;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch aBranch = findBranch(branchName);
        if (aBranch != null) {
            return aBranch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branch, String customer, double transactionAmount){
        Branch aBranch = findBranch(branch);

        if (aBranch != null) {
            return aBranch.addCustomerTransaction(customer, transactionAmount);

        }

        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(Customer branchCustomer: branchCustomers) {
                System.out.println("Customer: " + branchCustomer.getName() + "[" +
                        (branchCustomers.indexOf(branchCustomer) + 1) + "]");

                if (showTransactions) {
                    ArrayList<Double> customerTransactions = branchCustomer.getTransactions();
                    System.out.println("Transactions");
                    for (Double customerTransaction: customerTransactions) {
                        System.out.println("[" +
                                (customerTransactions.indexOf(customerTransaction) + 1) +
                                "]  Amount " +
                                customerTransaction);
                    }
                }
            }
            return true;
        }
        return false;
    }
}