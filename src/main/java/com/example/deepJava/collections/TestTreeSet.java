package com.example.deepJava.collections;

import java.util.TreeSet;
/*
    * TreeSet es una implementación de Set que ordena los elementos de forma ascendente.
    * Si un elemento es igual a otro, el que esté primero en el TreeSet se queda.
 */
public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Mundo");
        treeSet.add("Hola");
        treeSet.add("Java");
        treeSet.add("by");
        treeSet.add("juandieruiz");
        treeSet.add("juandieruiz");
        System.out.println(treeSet);
    }
}
