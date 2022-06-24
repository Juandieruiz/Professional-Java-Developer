package com.example.deepJava.training;

import java.util.Scanner;

public class TrainingOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double num2 = sc.nextDouble();

        /* double num1 = 14;
         double num2 = 17;
        */
        double areaTriangle= num1 * num2/2;
        double areaRectangle= num1 * num2;
        double areaCircle= (int) (Math.PI * Math.pow(num1, 2));
        double areaSquare= num1 * num2;
        System.out.println("El area del triangulo es: " + areaTriangle);
        System.out.println("El area del rectangulo es: " + areaRectangle);
        System.out.println("El area del circulo es: " + areaCircle);
        System.out.println("El area del cuadrado es: " + areaSquare);
    }
}

