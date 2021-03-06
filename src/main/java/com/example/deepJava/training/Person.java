package com.example.deepJava.training;

// Definición de la clase
public class Person {
    // atributos
    String name;
    int age;
    char gender;

    public Person() {
        System.out.println("Constructor por defecto");
    }
    public Person(String n, int a, char g) {
        this(); // Invocacion de constructor por defecto
        this.name = n;
        this.age = a;
        this.gender = g;
    }

    void workInWith(Person p) {
        System.out.println(name+ " Esta trabajando con "+p.name);
    }
    // Methods
    void printInformation(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Gender:" + gender );
    }

    public static void main(String args[]){
        Person p = new Person("Alex",32,'M');
        p.printInformation();

        Person p1 = new Person("Maria",41,'M');
        p1.printInformation();
        p.workInWith(p1);
    }
}
