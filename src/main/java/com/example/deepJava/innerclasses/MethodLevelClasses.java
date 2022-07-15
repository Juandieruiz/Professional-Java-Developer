package com.example.deepJava.innerclasses;

public class MethodLevelClasses {

    static void foo() {
        class InternalClassMethod {
            void bar () {
                System.out.println("bar");
            }
    }

        InternalClassMethod obj = new InternalClassMethod();
    obj.bar();
}


    public static void main(String[] args) {
        foo();
    }
}
