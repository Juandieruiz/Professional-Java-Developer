package com.example.deepJava.herencia;

public class MascotaMethods {

    public class Animal{
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
            Animal a= new Animal();
            Dog dog = new Dog();
            Cat cat = new Cat();


            System.out.println(a instanceof Animal); //true
            System.out.println(a instanceof Dog); //false
            System.out.println(a instanceof Cat); //false


            dog.name = "Fido";
            dog.breath();
            System.out.println(dog instanceof Animal); //true


            cat.breath();
            System.out.println(cat instanceof Animal); //true

        }
    }
}
