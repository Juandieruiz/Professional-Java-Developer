package com.example.deepJava.herencia;

public class BankAccount {
    int numberAccount;
    String idCountry;
    public BankAccount(int numberAccount, String idCountry) {
        this.numberAccount = numberAccount;
        this.idCountry = idCountry;
    }

    void informationAccount() {
        System.out.println("The account number is: " + numberAccount);
    }

    void idCountry() {
        System.out.println("The ID country is: " + idCountry);
    }

    void transaction() {
        System.out.println("Making a transaction..."+numberAccount);
    }
}
