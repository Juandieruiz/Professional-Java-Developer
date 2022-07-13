package com.example.deepJava.collections;

import java.util.TreeSet;

class Dog implements Comparable<Dog> {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Dog o) {
        // Dog dog = (Dog) o; // Transformamos el objeto a un Dog (cast) cuando la clase solo implementa Comparable
        return name.compareTo(o.getName()); // En este caso el comparable es de tipo <Dog> y ahora
        // Devolvemos el nombre del objeto y lo comparamos con el nombre del objeto que se le pasa
        // return p.getName().compareTo(o.getName());  los devuelve de forma ascendente
    }
}

public class ComparablesTest {
    public static void main(String[] args) {
        TreeSet<Dog> set = new TreeSet<>();
        set.add(new Dog("Fido"));
        set.add(new Dog("Bella"));
        set.add(new Dog("Abby"));
        System.out.println(set);
    }
}
