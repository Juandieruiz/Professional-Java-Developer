package com.example.deepJava.herency;

public class User extends BankAccount {
    String name;

    User(String name,int numberAccount, String idCountry) {
        super(numberAccount, idCountry);
        this.name = name;
    }

    @Override
    void transaction(){
        super.transaction();
        System.out.println("The USER: "+ name +" send money " +numberAccount);
    }

    void sendCash(){
        System.out.println("User: " + name + " esta enviando dinero desde su cuenta: " + numberAccount);
    }
    void receiveCash(){
        System.out.println("User: " + name + " esta recibiendo dinero hacia su cuenta: " + numberAccount);
    }
}
