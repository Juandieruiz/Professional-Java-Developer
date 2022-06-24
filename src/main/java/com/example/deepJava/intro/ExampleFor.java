package com.example.deepJava.intro;

public class ExampleFor {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        int tabla = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(tabla * i);
        }
    }
}
