package com.example.deepJava.herencia;

public class User extends BankAccount {
    String name;

    void sendCash(){
        System.out.println("Usuario: " + name + " esta enviando dinero desde su cuenta: " + numberAccount);
    }
    void receiveCash(){
        System.out.println("Usuario: " + name + " esta recibiendo dinero hacia su cuenta: " + numberAccount);
    }
}
