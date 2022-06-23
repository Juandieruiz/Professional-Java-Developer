package com.example.deepJava.herencia;

public class Clients {
    public static void main(String[] args) {
        User u1 = new User("Jhon Evans",777654753,"ES");

        User u2 = new User("Melissa Lopez",777654754,"IT");

        // U1
        u1.sendCash();
        u1.transaction();
        u1.idCountry();

        // U2
        u2.receiveCash();
        u2.informationAccount();
    }
}
