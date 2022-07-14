package com.example.deepJava.exceptions;

public class ExampleTryCatch {


    public static void main(String[] args) {
        try {
            // int x = 0;
            int x = 10;
            int y = 10 / x;
            System.out.println("Caculando operación = " + y);
            String name = "juandieruiz";
            System.out.println("Hola " + name.toString());
            String arr[] = {"comoserprogramador.com","juandieruiz"};
            System.out.println(arr[3]);

        //  Posibles Errores:
           } catch (ArithmeticException e) {
            System.err.printf("Arithmetic Exception %s \n", e.getMessage());

        } catch (NullPointerException e) { // <-- Uso de multiples catchs
            System.err.printf("NullPointer Exception %s \n", e.getMessage());
         // Si pasan los errores anteriores, se ejecuta este catch
        } catch (Exception e) {
            System.err.printf("Exception %s \n", e.getMessage());
        } finally {
            System.out.println("Siempre se ejecuta el finally haya o no una excepción, error o no");
        }
    }
}
