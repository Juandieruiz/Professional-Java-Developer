package com.example.deepJava.polymorphism.figures.automovil;

public class HybridCar extends Car{
    String Battery;
    String inyectors;

    public HybridCar(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    public void acelerar() {
        System.out.println("Acelerando");
    }

    public void changeBattery(String Battery) {
        System.out.println("Changing battery to fuel");
    }

    public String getBattery() {
        return Battery;
    }

    public void setBattery(String battery) {
        Battery = battery;
    }

    public String getInyectors() {
        return inyectors;
    }

    public void setInyectors(String inyectors) {
        this.inyectors = inyectors;
    }
}
