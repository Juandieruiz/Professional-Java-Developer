package com.example.deepJava.intro;

public class EjemploWhile {
    public static void main(String[] args) {
    int x = 0;
    /* while (x < 100) {
        System.out.println("Writing Code in the line..." + x );
        x++;
        }
        */
    do {
        System.out.println("Esto lo hacemos hasta que llegue a 25, turno #" + x);
        x++;
        } while (x <= 25);
    }
}

