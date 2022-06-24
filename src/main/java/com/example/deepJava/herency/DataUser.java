package com.example.deepJava.herency;

public class DataUser extends User{
    float salary;

    DataUser(Float salary,String name, int numberAccount, String idCountry) {
        super(name, numberAccount, idCountry);
        this.salary = salary;
    }

    void working(){
        System.out.println("I'm "+ name +" and I working");
    }

    void earnSalary(){
        System.out.println("I'm "+ name +" and I earn: " + salary +"€");
    }


}
