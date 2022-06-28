package com.example.deepJava.arrays;

public class TestMultidimensionalArrays {
    /**
     * 20 25
     * 40 45
     */

    public static void main(String[] args) {
        int a[][] = new int[2][2];
        a[0][0] = 20;
        a[0][1] = 25;
        a[1][0] = 40;
        a[1][1] = 45;

        for (int i =0 ; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
        }
    }
}
