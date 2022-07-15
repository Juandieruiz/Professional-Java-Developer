package com.example.deepJava.exceptions;

public class ExampleThrow {
    /**
     * Manejar excepciones será una de dos cosas:
     * - Atrapar la excepcion que se produce en el metodo (try catch)
     * - Propagar a quien invoco el metodo la excepcion (throw)
     * @throws Exception
     *
     */
    static double dividir(int a, int b) throws Exception {


        if (b != 0) {
            return a / b;
        } else {
                throw new Exception("No se puede dividir por cero");
        }
    }
    public static void main(String[] args)  {
        double resultado = 0;
        try {
            resultado = dividir(10, 0);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        /*
        double result = dividir(1000, 7);
        System.out.println("El resultado es : " + result);
        double result2 = dividir(10, 0);
        System.out.println(result2);
        */

    }

}

