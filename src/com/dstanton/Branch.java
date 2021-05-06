package com.dstanton;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch (String name) {
        this.name = name;
        customers = new ArrayList<Customer> ();
    }

    public boolean newCustomer(String name, double initialTransaction) {
        if (findCustomer(name) == null) {
            this.customers.add(new Customer(name, initialTransaction));
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String name) {
        for (Customer c: customers) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer aCustomer = findCustomer(name);
        if (aCustomer != null) {
            aCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }
}
