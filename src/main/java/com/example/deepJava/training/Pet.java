package com.example.deepJava.training;

public class Pet {

    String name;
    int age;
    String propietario;

    String especie;
    boolean chip;

    public Pet(String n, int age, String propietario, String e, boolean chip) {
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
        Pet uno = new Pet("tobby",2,"Mario","perro",false);
        Pet dos = new Pet("snow",3,"Ximena","gato",false);
        Pet tres = new Pet("shaze",1,"Julian","pajaro",false);
        Pet cuatro = new Pet("lulu",3,"Laura","perro",false);
        uno.printInformation();
        dos.printInformation();
        tres.printInformation();
        cuatro.printInformation();
    }

}
