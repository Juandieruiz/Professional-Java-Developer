package com.example.deepJava.collections;

import java.util.TreeMap;

/**
 * TreeMap es una implementación de Map que utiliza un árbol binario de búsqueda para almacenar los elementos.
 * El árbol binario de búsqueda es una estructura de datos que permite buscar un elemento en una estructura de datos
 * de forma eficiente.
 */
public class TreeMapTest {
    public static void main(String[] args) {
        // K, V
        TreeMap<String,String> map = new TreeMap<>();

        map.put("Cristiano Ronaldo", "Futbolista");
        map.put("Juan Diego", "Desarrollador");
        map.put("Andres", "Medico");

        System.out.println(map);
    }
}
