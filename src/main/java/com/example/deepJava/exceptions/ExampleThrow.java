package com.example.deepJava.exceptions;

public class ExampleThrow {

    static double dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }

    }
    public static void main(String[] args) {
        double result = dividir(1000, 7);
        System.out.println("El resultado es : " + result);
        double result2 = dividir(10, 0);
        System.out.println(result2);

    }

}

