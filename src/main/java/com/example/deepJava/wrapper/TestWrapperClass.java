package com.example.deepJava.wrapper;

public class TestWrapperClass {
    public static void main(String[] args) {
        // Tipo de dato primitivo
        int x=10;
        // Tipo de dato Wrapper
        Integer x1=10;
        System.out.println(x);
        System.out.println(x1.floatValue());
        System.out.println(x1.intValue());
        System.out.println(x1.longValue());
        System.out.println(x1.doubleValue());
        System.out.println(x1.shortValue());
        System.out.println(x1.byteValue());

    }
}
