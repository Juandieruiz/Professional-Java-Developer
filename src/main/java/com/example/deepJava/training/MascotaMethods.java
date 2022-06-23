package com.example.deepJava.training;

public class MascotaMethods {

    class Animal{
        String name;
        public void breath(){
            System.out.println("I'm Animal and I breath");
        }
    }

    class Dog extends Animal {

    }

    class Cat extends Animal {

    }


    public class ExampleHierarchy {
        public void main(String[] args) {
            Dog dog = new Dog();
            Cat cat = new Cat();
            dog.name = "Fido";
            dog.breath();
            cat.breath();
        }
    }
}
