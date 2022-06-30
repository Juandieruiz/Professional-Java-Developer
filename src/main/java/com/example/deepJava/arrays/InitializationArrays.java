package com.example.deepJava.arrays;

public class InitializationArrays {
    static void printArray(String users[]){
        for (String e : users) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        // Explicit
        String users[]= new String[2];
        users[0] = "Juandieruiz";
        users[1] = "Explicit";
        printArray(users);
        // Implicit
        String users2[] = {"Juandieruiz", "Implicit"};
        printArray(users2);
        // anonima
        String users3[] = new String[] {"Juandieruiz", "anonymour"};
        //printArray(users3);
        printArray(new String[] {"Juandieruiz", "nginx"});
    }

}
