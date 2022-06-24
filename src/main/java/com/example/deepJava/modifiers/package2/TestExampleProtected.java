package com.example.deepJava.modifiers.package2;

import com.example.deepJava.modifiers.package1.ExampleProtected;

public class TestExampleProtected extends ExampleProtected {

    void bar() {
        System.out.println("Sending from bar..");
        foo();
    }

    public static void main(String[] args) {
            TestExampleProtected e = new TestExampleProtected();
        e.foo();
        e.bar();
    }
}

