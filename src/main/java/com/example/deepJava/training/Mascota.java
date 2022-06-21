package com.example.deepJava.training;

public class Mascota {

    String name;
    int age;
    String propietario;

    String especie;
    boolean chip;

    public Mascota(String n, int age, String propietario,String e, boolean chip) {
        this.name = n;
        this.age = age;
        this.propietario = propietario;
        this.especie = e;
        this.chip = chip;
    }

    void printInformation(){
    System.out.println("La mascota: " + name + " tiene " + age + " años y es un "+ especie +"; Su dueño es:"+ propietario);
    }

    public static void main(String args[]){
        Mascota uno = new Mascota("tobby",2,"Mario","perro",false);
        Mascota dos = new Mascota("snow",3,"Ximena","gato",false);
        Mascota tres = new Mascota("shaze",1,"Julian","pajaro",false);
        Mascota cuatro = new Mascota("lulu",3,"Laura","perro",false);
        uno.printInformation();
        dos.printInformation();
        tres.printInformation();
        cuatro.printInformation();
    }

}
