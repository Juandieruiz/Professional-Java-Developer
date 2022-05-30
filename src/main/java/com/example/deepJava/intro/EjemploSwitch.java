package com.example.deepJava.intro;

public class EjemploSwitch {
    public static void main(String[] args) {
        int optionPayment = 1;

        switch (optionPayment) {
            case 1:
                System.out.println("You pay with bizum");
                break;
            case 2:
                System.out.println("You pay with paypal");
                break;
            case 3:
                System.out.println("You pay with credit card");
                break;
            default:
                System.out.println("You pay with unknown or efective");
                break;
        }
    }
}
