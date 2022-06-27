package com.example.deepJava.statics;

class Human {
    static int numberOfHumans = 0; // cada objeto de la clase Human incrementa el contador
    String nombre; // Cada objeto Human tiene un nombre
    public Human() {
        numberOfHumans++;
    }
}

public class ExampleStaticInVariables {
    int x = 0;

    public static void main(String[] args) {
        // no podemos ver 'x' System.out.println(x); por que es una variable de instancia
        // pero podemos ver 'numberOfHumans' System.out.println(numberOfHumans); por que es una variable de clase
        System.out.println(Human.numberOfHumans);
        new Human();
        new Human();
        new Human();
        new Human();

        System.out.println(Human.numberOfHumans);
    }
}
