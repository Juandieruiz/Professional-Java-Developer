package com.example.deepJava.polymorphism.figures;

public class TestDrawable {
    void testDraw(Drawable d) {
        d.draw();
    }

    public static void main(String[] args) {
        TestDrawable d = new TestDrawable();
        d.testDraw(new Rectangle("red", 10, 20));
        d.testDraw(new Circle("blue", 10));
        d.testDraw(new Image());

        System.out.println(new Circle("blue", 10) instanceof Drawable);
    }
}
