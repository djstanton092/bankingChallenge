package com.dstanton;


public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Bank of Dan");
        bank.addBranch("Simi Valley");
        bank.addBranch("Woodland Hills");

        bank.addCustomer("Simi Valley", "Dan", 1.00);
        bank.addCustomer("Simi Valley", "Lori", 2.00);
        bank.addCustomer("Simi Valley", "Adam", 3.00);
        bank.addCustomer("Simi Valley", "Alex", 4.00);

        bank.addCustomer("Woodland Hills", "Eric", 0.01);
        bank.addCustomer("Woodland Hills", "Marci", 0.01);
        bank.addCustomer("Woodland Hills", "Brian", 0.01);
        bank.addCustomer("Woodland Hills", "Adam", 0.01);

        bank.addCustomerTransaction("Woodland Hills", "Eric", -10);
        bank.addCustomerTransaction("Woodland Hills", "Eric", 500);
        bank.addCustomerTransaction("Woodland Hills", "Eric", -300);
        bank.addCustomerTransaction("Woodland Hills", "Eric", 1.95);






        bank.listCustomers("Simi Valley", false);

        bank.listCustomers("Woodland Hills", true);





    }
}
