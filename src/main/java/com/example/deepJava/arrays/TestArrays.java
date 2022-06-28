package com.example.deepJava.arrays;

public class TestArrays {
    public static void main(String[] args) {
        int array[] = new int[3];
        array[0] = 03;
        array[1] = 20;
        array[2] = 2000;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int i= 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
        for(int temp:array){
            System.out.println(temp);
        }

        for (int j = 0; j < array.length ; j++) {
            System.out.println(array[j]);
        }


    }
}
