package com.example.deepJava.statics;

public class Calculator {
    // El metodo static no requiere un objeto para ser invocado
    int suma (int a, int b) {
       return(a + b);
    }

    static int resta (int a, int b) {
       return(a - b);
    }

    public static void main(String[] args) {
        Calculator a = new Calculator();
        System.out.println(a.suma(5,5));
        System.out.println(resta(5,5));
    }
}
