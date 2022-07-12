package com.example.deepJava.collections;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("a");
        list.add(5);
        list.add("juandieruiz");

        System.out.println(list.peek());
        System.out.println(list);
        // System.out.println(list.poll()); corta el primer elemento de la lista
        // System.out.println(list.pollLast()); // corta el ultimo elemento de la lista
        // System.out.println(list.peek()); // muestra el primer elemento de la lista
        // System.out.println(list.peekLast()); // muestra el ultimo elemento de la lista
        // System.out.println(list.getFirst()); // muestra el primer elemento de la lista
        // System.out.println(list.getLast()); // muestra el ultimo elemento de la lista
    }
}
