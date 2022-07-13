package com.example.deepJava.collections;

import java.util.Vector;

/**
 * @author juandieruiz
 *  Vector junto HashTable son las colecciones iniciales agregadas en la version 1.2
 *  su comportamiento es similar a la de un ArrayList a diferencia de que Vector es thread-safe.
 *
 *  Vector es synchronized, sirve para cuando se quiere asegurar que una operacion se realiza en una sola ejecucion.
 *
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        list.add("juandieruiz");
        System.out.println(list.get(0));
    }
}
