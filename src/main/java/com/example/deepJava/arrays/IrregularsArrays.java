package com.example.deepJava.arrays;

/**
 * 10
 * 10 20
 * 30 40 50
 * 50 50
 */
public class IrregularsArrays {
    public static void main(String[] args) {
        int a[][] = new int[4][];
        a[0] = new int[1];
        a[0][0] = 10;

        a[1] = new int[2];
        a[1][0] = 10;
        a[1][1] = 20;

        a[2] = new int[3];
        a[2][0] = 30;
        a[2][1] = 40;
        a[2][2] = 50;

        a[3] = new int[2];
        a[3][0] = 50;
        a[3][1] = 50;

        for(int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        //foreach
        for (int[] is:a){
            for(int is2 : is){
                System.out.print(is2+"\t");
            }
            System.out.println();
        }

    }
}
