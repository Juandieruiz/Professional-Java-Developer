package com.example.deepJava.collections;

import java.util.HashSet;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        System.out.println(hashSet.add("A"));
        System.out.println(hashSet.add("A"));
        hashSet.add("A");
        hashSet.add("C");
        hashSet.add(null); // ausencia de objeto nulo
        System.out.println(hashSet);

    }
}
