package com.example.deepJava.collections;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        // Los Arraylist tienen una capacidad de 10 elementos por defecto
        ArrayList array = new ArrayList();
        array.add(1);
        array.add("ae");
        array.add(true);
        array.add(new TestArrayList());
        System.out.println(array);

        ArrayList<String> e = new ArrayList();
        e.add("ae");
        e.add("alfa4alfa");
        e.add("beta3beta");
        e.add("omega8omega");
        e.add("ae");
        e.add("alfa4alfa");
        e.add("beta3beta");
        e.add("omega8omega");
        e.add("ae");
        e.add("alfa4alfa");
        e.add("beta3beta");
        e.add("omega8omega");

        // Es muy ineficiente agregar un elemento a un arraylist cada vez que se llama a add()
        e.add(3,"juandieruiz");

        System.out.println(e.size());
        System.out.println(e);

    }
}
