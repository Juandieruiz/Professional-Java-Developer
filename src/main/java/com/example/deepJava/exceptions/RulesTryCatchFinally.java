package com.example.deepJava.exceptions;

/**
 * Solo el bloque Try es obligatorio.
 */



public class RulesTryCatchFinally {

    static void test() {
        try {
            System.out.println("Try");
            System.exit(0);
            return;
        } finally { // Siempre se ejecuta Finally a menos de que ejecutemos un System.exit(0)
            System.out.println("Finally");
        }
    }


    public static void main(String[] args) {
        // Bloque con catch
        try {
            System.out.println("Try");
        } catch (Exception e) {
            System.out.println("Catch");
        }
        // Bloque con finally
        try {

        } finally {

        }
        // Bloque con try-catch-finally
        try {
            System.out.println("Try");
        } catch (Exception e) {
            System.out.println("Catch");
        } finally {
            System.out.println("Finally");
        }
        // Bloque con multiplos catch pero solo 1 se ejecuta
        try {
            System.out.println("Try");
        } catch (Exception e) {
            System.out.println("Catch");
        } catch (Throwable e) {
            System.out.println("Catch");
        }
        // Niveles de excepciones : Recyerda que si una excepcion es de mayor nivel que la otra, la primera se ejecuta
        try {
            System.out.println("Try");
        } catch (NullPointerException e) { // Quiero capturar la excepcion NullPointerException
            System.out.println("Catch");
        } catch (RuntimeException e) { // Si esta excepcion estaría antes que la anterior, se ejecutaría primero
            System.out.println("Catch");
        } catch (Exception e) {
            System.out.println("Catch");
        } catch (Throwable e) {
            System.out.println("Catch");
        }
    }
}