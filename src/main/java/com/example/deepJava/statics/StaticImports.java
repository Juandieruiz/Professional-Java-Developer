package com.example.deepJava.statics;
// Estamos importando el miembro de la clase Math sqrt
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
// Importacion de todo Math
//import static java.lang.Math.*;


public class StaticImports {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(15));
        // Podemos llamar a sqrt sin la clase Math
        System.out.println(sqrt(15));
        // No podemos llamar a pow sin la clase Math, por que no esta importado static
        // System.out.println(pow(2, 3));
        // Si ponemos el import static con * podemos llamar a todos los miembros de la clase Math
        System.out.println(PI);

    }

}
