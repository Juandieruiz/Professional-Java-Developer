package com.example.deepJava.statics;

class A{
    // Si usamos un metodo static no podrá implementarse en una clase hija
    static void foo(){
        System.out.println("foo from A");
    }
}
class B extends A{
    static void foo(){
        System.out.println("foo from B");
    }
}
public class StaticAndPolymorphism {
    public static void main(String[] args) {
        // invoca el foo de la clase hija sin ser estaticas(static)
        // Si las dos clases son estaticas(static), el metodo invocará el de la clase padre
        A a = new B();
        a.foo();
    }
}
