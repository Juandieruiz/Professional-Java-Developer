package com.example.deepJava.polymorphism.figures;

public class TestFigures {
    void printArea(Figure figure) {
        System.out.println("The color is: "+ figure.getColor() +" and Area is: " + figure.calcArea());
    }
    public static void main(String[] args) {
        TestFigures p = new TestFigures();
        Circle circle = new Circle("red", 10.0);
        Rectangle rectangle = new Rectangle("blue", 20, 10);
        Square square = new Square("green", 125.2);
        p.printArea(circle);
        p.printArea(rectangle);
        p.printArea(square);
        p.printArea(new Circle("black",7.7));
    }
}
