package com.example.deepJava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        List<String> squads = new ArrayList<>();

        squads.add("Zulu");
        squads.add("Epsilon");
        squads.add("Beta");
        squads.add("Foxtrot");
        squads.add("Delta");
        squads.add("Alpha");
        squads.add("Gamma");
        squads.add("Charlie");
        squads.add("Hotel");
        squads.add("Tango");

        Collections.sort(squads);
        int index = Collections.binarySearch(squads, "Zulu");
        System.out.println("Charlie is at index " + index);
        System.out.println(squads);

    }
}
