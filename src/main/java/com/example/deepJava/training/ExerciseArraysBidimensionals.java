package com.example.deepJava.training;

public class ExerciseArraysBidimensionals {
    public static void main(String[] args) {
        // 2 arrays bidimensionales de las mismas dimensiones y luego sumarlos.
        int[][] array = new int[2][2];
        array[0][0] = 10;
        array[0][1] = 20;
        array[1][0] = 30;
        array[1][1] = 40;
        // Sumar los elementos de la matriz
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("a"+i);
            for (int j = 0; j < array[i].length; j++) {
                 System.out.println("b"+j);
                sum += array[i][j];
            }
        }
        System.out.println(sum);

    }
}
