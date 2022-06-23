package com.example.deepJava.herencia;

public class BankAccount {
    int numberAccount;
    String owner;

    void informationAccount() {
        System.out.println("The account number is: " + numberAccount);
    }

    void owner(int amount) {
        System.out.println("The owner is: " + owner);
    }

    void transaction() {
        System.out.println("Making a transaction...");
    }
}
