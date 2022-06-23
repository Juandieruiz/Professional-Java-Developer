package com.example.deepJava.herencia;

public class DataUser extends User{
    float salary;

    void work(){
        System.out.println("I'm "+ name +" and I working");
    }

    void earnSalary(){
        System.out.println("I'm "+ name +" and I earn: " + salary +"€");
    }
}
