package com.example.deepJava.exceptions;

public class ExampleTryCatch {


    public static void main(String[] args) {
        try {
            // int x = 1;
            int x = 0;
            int y = 10 / x;
            System.out.println("Caculando operación = " + y);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Siempre se ejecuta el finally haya o no una excepción");
        }
    }
}
