package com.example.deepJava.polymorphism.figures;

public class Rectangle extends Figure{
    private double base;
    private double height;

    public Rectangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double calcArea() {
        return base*height;
    }
}
