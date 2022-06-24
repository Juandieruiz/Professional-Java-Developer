package com.example.deepJava.modifiers;

// Nos servirá para el patrón de diseño Singleton (Singleton Pattern)

class Test{
    private String name;

    public Test(){

    }

    private void foo(){
        System.out.println("foo");
    }

}

public class ExamplePrivate {
    public static void main(String[] args) {
        Test t = new Test();
        //t.foo(); //No funciona porque foo() es private
    }
}
