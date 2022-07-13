package com.example.deepJava.collections;

import java.util.HashMap;
import java.util.Map;
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

        System.out.println(confluence);
        for (String key: confluence.keySet()) {
            System.out.println(key + "=" + confluence.get(key));
        }

    }
}
