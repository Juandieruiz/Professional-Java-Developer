package com.example.deepJava.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
HashMap es una implementación de Map que utiliza una tabla de hash para almacenar los elementos.
 */

public class TestHashMap {
    public static void main(String[] args) {
        // Map <K, V> = Key, Value
        Map<String, String> confluence = new HashMap<>();
        confluence.put("Java", "Oracle");
        confluence.put("TypeScript", "Microsoft");
        confluence.put(null, "Ausencia de objeto");
        confluence.put("Java", "Lenguaje de programación");


        System.out.println(confluence);
        for (String key : confluence.keySet()) {
            System.out.println(key + "=" + confluence.get(key));
        }

        /* Otra forma de imprimir datos es con Entry
        for (Entry<String, String> entry : confluence.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }*/
        System.out.println("\n");
        // al Hashcode de Java se le aplica una función modular, para que no se repita el mismo valor
        System.out.println(Math.abs("Java".hashCode()%16));
        System.out.println("Java".hashCode());

        /**
         * El HashMap construye un Mapa con el valor inicial de tamaño 16, llamadas buckets.
         * Almacenan listas ligadas de elementos. (como linked list)
         *
         * 0 2301506, Java=Oracle
         * 1
         * 2 2301506, Java=Lenguaje de programación
         * 3
         * 4
         * 5 555046085 TypeScript ... ---> 5, 71327253, Jaava...
         * 6
         * 7 3392903 null=Ausencia de objeto
         *
         * 16
         *
         *
         */

    }
}
