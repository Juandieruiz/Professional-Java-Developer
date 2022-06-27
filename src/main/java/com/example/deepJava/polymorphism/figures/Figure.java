package com.example.deepJava.polymorphism.figures;

public class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calcArea() {
        System.out.println("default implementation");
        return 0;
    }
}
