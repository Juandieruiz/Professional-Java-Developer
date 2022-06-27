package com.example.deepJava.statics;

class Humano {
    String name;
    static int numberOfHumans = 0;
    public Humano() {
        System.out.println("1 - Constructor");
    }

    public Humano(String name) {
        System.out.println("2 - Constructor sobrecargado");
        this.name = name;
    }
    // Bloque Anonimo
    {
        System.out.println("Bloque Anonimo #1");
        numberOfHumans++;
    }
    {
        System.out.println("Bloque Anonimo #2");
    }

}
public class BloquesAnonimos {

        int x = 0;

        public static void main(String[] args) {
            System.out.println(com.example.deepJava.statics.Humano.numberOfHumans);
            new Humano();
            new com.example.deepJava.statics.Humano();
            new com.example.deepJava.statics.Humano("Juan");
            new com.example.deepJava.statics.Humano("Pedro");

            System.out.println("Numero de Humanos= " + Humano.numberOfHumans);
        }


}
