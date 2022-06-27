package com.example.deepJava.statics;

public class BloqueStatic {
    // UN BLOQUE STATIC ES UN BLOQUE QUE SE EJECUTA SOLO UNA VEZ, y se inicializa en el momento de la ejecucion del programa
    static {
        System.out.println("Static block");
    }
    // PODEMOS PONER n Cantidad de BLOQUES STATICS
    static {
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
