package com.example.deepJava.herencia;

public class Clients {
    public static void main(String[] args) {
        User u1 = new User();
        u1.name = "Jhon";
        u1.numberAccount = 777654753;
        u1.idCountry = "ES-Spain";

        User u2 = new User();
        u2.name = "Melissa";
        u2.numberAccount = 777-654-754;
        u2.idCountry = "IT-Italy";

        // U1
        u1.sendCash();
        u1.transaction();
        u1.idCountry();

        // U2

    }
}
