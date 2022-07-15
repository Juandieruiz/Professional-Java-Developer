package com.example.deepJava.innerclasses;

/**
 * Clases Internas Regulares
 */
class Extern {
    void foo() {
            System.out.println("Foo");
        }
    class Internal {
        void bar() {
            System.out.println("Bar");
        }
    }
}

public class InnerClassesRegulars {
    public static void main(String[] args) {
        Extern e = new Extern();
        e.foo();
        Extern.Internal i = e.new Internal();
        i.bar();
    }
}
