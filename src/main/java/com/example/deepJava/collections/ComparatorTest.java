package com.example.deepJava.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Cat {
    private String name;
    private String owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Cat(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}

class OrdenandoPorNombre implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class OrdenandoPorDueño implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getOwner().compareTo(o2.getOwner());
    }
}


public class ComparatorTest {
    public static void main(String[] args) {
        Set<Cat> cats = new TreeSet<>(new OrdenandoPorNombre());
        cats.add(new Cat("Zom", "John"));
        cats.add(new Cat("Abby", "Mary"));
        cats.add(new Cat("Bing", "Steve"));
        cats.add(new Cat("Zom", "James"));

        System.out.println(cats);
        System.out.println("-----------------------------------------------------");

        Set<Cat> ownerCats = new TreeSet<>(new OrdenandoPorDueño());
        ownerCats.add(new Cat("Zom", "John"));
        ownerCats.add(new Cat("Abby", "Mary"));
        ownerCats.add(new Cat("Bing", "Steve"));
        ownerCats.add(new Cat("Zom", "James"));
        System.out.println(ownerCats);
    }

}
