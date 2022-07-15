package com.example.deepJava.innerclasses;

class ExternalStatic {
  public void foo() {
      System.out.println("FOO");
    }

    static class InternalStatic {
       void bar() {
          System.out.println("BAR");
        }
  }
}

public class InternalStaticClass {
    public static void main(String[] args) {

        ExternalStatic.InternalStatic obj = new ExternalStatic.InternalStatic();
        obj.bar();
    }
}