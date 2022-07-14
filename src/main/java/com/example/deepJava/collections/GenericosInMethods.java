package com.example.deepJava.collections;

import java.util.Arrays;
import java.util.List;

public class GenericosInMethods {
    // Uso de wildcards en métodos
    // Los wildcards son una forma de especificar que se puede usar cualquier tipo de dato
        static double sumarValores(List<? extends Number> valores) {
        double suma = 0;
        for (Number valor : valores) {
            suma += valor.doubleValue();
        }
        return suma;
    }

    public static void main(String[] args) {
        double sumandoValores = sumarValores(Arrays.asList(1.0, 2.0, 3.0,4,7,10.5f,1200l));
        System.out.println(sumandoValores);
    }
}
