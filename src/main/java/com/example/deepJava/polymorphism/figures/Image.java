package com.example.deepJava.polymorphism.figures;
/**
 * Requerimientos:
 *  Clases que puedan ser dibujadas
 *  No solo puedas dibujar figuras
 * Uso de interfaces en Java
 *
 * @author juandieruiz
 */
public class Image implements Drawable {
 º

    @Override
    public void draw() {
        System.out.println("drawing an image");
    }
}


