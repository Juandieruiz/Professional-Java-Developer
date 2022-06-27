package com.example.deepJava.polymorphism.figures;

public class Circle extends Figure implements Drawable {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    void rode() {
        System.out.println("Circle "+ getColor() +" is a round figure");
    }


    @Override
    public void draw() {
        System.out.println("drawing a circle");
    }
}
