package com.example.deepJava.training;

// Definición de la clase
public class Person {
    // atributos
    String name;
    int age;
    char gender;

    void workInWith(Person p) {
        System.out.println(name+ " Esta jugando con "+p.name);
    }
    // Methods
    void printInformation(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Gender:" + gender );
    }

    public static void main(String args[]){
        Person p = new Person();
        p.name="Martina";
        p.age=41;
        p.gender='M';
        p.printInformation();

        Person p1 = new Person();
        p1.name="Maria";
        p1.age=41;
        p1.gender='M';
        p.workInWith(p1);
    }
}
