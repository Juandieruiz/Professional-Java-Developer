package com.example.deepJava.polymorphism.figures;

public class Circle extends Figure{
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }


}
