package com.example.deepJava.wrapper;

public class ConversionMethods {
    public static void main(String[] args) {
        Integer x = 10;
        Double d = x.doubleValue();
        float f = x.floatValue();
        long l = x.longValue();

        String value= "10";
        int val = Integer.parseInt(value);
        System.out.println(val);

        Double valueOf = Double.valueOf("55");
        System.out.println(valueOf);

    }
}
