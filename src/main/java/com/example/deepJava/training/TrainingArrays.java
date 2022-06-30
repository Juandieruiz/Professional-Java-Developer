package com.example.deepJava.training;

public class TrainingArrays {
    // Arrays de cada tipo de dato
    boolean[] booleanArray = new boolean[10];
    byte[] byteArray = new byte[10];
    char[] charArray = new char[10];
    short[] shortArray = new short[10];
    int[] intArray = new int[10];
    long[] longArray = new long[10];
    double[] doubleArray = new double[10];
    String[] stringArray = new String[10];
    Object[] objectArray = new Object[10];



    public static void main(String[] args) {
        // Array binario en forma de triangulo
        int[][] a = new int[3][];
        a[0] = new int[5];
        a[0][0] = 0;
        a[0][1] = 0;
        a[0][2] = 1;
        a[1] = new int[5];
        a[1][0] = 0;
        a[1][1] = 1;
        a[1][2] = 1;
        a[1][3] = 1;
        a[1][4] = 0;
        a[2] = new int[5];
        a[2][0] = 1;
        a[2][1] = 1;
        a[2][2] = 1;
        a[2][3] = 1;
        a[2][4] = 1;
        // foreach
        for (int[] is:a){
            for(int is2 : is){
                System.out.print(is2+"\t");
            }
            System.out.println();
        }
    // Array de mascotas y rellenarlo
    String[] pets = {"Firulais", "Tobby", "Snow"};

    };
}

