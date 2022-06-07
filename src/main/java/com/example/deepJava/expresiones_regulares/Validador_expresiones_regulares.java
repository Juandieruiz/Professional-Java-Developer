package com.example.deepJava.expresiones_regulares;

public class Validador_expresiones_regulares {

   /*public static void main(String[] args) {
        System.out.println(validateNotSpecialCharactersField20("válid1")); // true
        System.out.println(validateNotSpecialCharactersField20("89valid1345u714"));// true
        System.out.println(validateNotSpecialCharactersField20("válid/0")); // true
        System.out.println(validateNotSpecialCharactersField20("//invalido"));
        System.out.println(validateNotSpecialCharactersField20("/invalido"));
        System.out.println(validateNotSpecialCharactersField20("inva//lid"));
        System.out.println(validateNotSpecialCharactersField20("invalid/"));

    }*/


    public static void main(String[] args) {
        System.out.println(validateNotSpecialCharactersField20("váliD0"));
        System.out.println(validateNotSpecialCharactersField21("vA/L´:D0"));
        System.out.println(validateNotSpecialCharactersField20("/INVALID"));
        System.out.println(validateNotSpecialCharactersField20("INV//ALID"));
        System.out.println(validateNotSpecialCharactersField20("INVALID/"));
        System.out.println(validateNotSpecialCharactersField21("/INVALID"));
        System.out.println(validateNotSpecialCharactersField21("INV//ALID"));
        System.out.println(validateNotSpecialCharactersField21("INVALID/"));
        System.out.println("----------------------------------------------------");
        System.out.println(validateSpecialCharactersField20_21("INV//ALID"));
        System.out.println(validateSpecialCharactersField20_21("INVALID/"));

    }
    public static boolean validateNotSpecialCharactersField20(String field20) {
        return field20.matches("^(?!\\/)(?:(?!\\/\\/).)*(?<!\\/)$");
    }
    public static boolean validateNotSpecialCharactersField21(String field21) {
        return field21.matches("^(?!\\/)(?:(?!\\/\\/).)*(?<!\\/)$");
    }

    //Refactor mode

    private static final String PREGEX = "^(?!\\/)(?:(?!\\/\\/).)*(?<!\\/)$";
    private static boolean validateSpecialCharactersField20_21(String field){
        return field.matches(PREGEX);
    }
}
