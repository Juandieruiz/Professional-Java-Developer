package com.example.deepJava.herency;

public class DataClients {
    public static void main(String[] args) {
        DataUser dataUser = new DataUser(1000f, "Juan", 123456789, "ES");
        DataUser dataUser2 = new DataUser(2000f, "Pedro", 1593587216, "IT");
        DataUser dataUser3 = new DataUser(3000f, "Maria", 478654152, "ES");
        DataUser dataUser4 = new DataUser(4000f, "Juan", 456789123, "IT");
        DataUser dataUser5 = new DataUser(5000f, "Maria", 753951456, "ES");

        dataUser.working();
        dataUser2.earnSalary();
        dataUser3.transaction();
        dataUser4.idCountry();
        dataUser5.informationAccount();
    }

}
