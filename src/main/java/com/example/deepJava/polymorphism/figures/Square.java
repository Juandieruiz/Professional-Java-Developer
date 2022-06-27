package com.example.deepJava.polymorphism.figures;

public class Square extends Figure{
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double calcArea() {
        return side*side;
    }

}
