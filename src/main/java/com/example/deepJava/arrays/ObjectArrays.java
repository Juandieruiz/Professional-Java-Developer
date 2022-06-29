package com.example.deepJava.arrays;

class Ordenador{
    private String marca;
    private float precio;
    private int ram;
    private int procesador;
    private boolean pantalla;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getProcesador() {
        return procesador;
    }

    public void setProcesador(int procesador) {
        this.procesador = procesador;
    }

    public boolean isPantalla() {
        return pantalla;
    }

    public void setPantalla(boolean pantalla) {
        this.pantalla = pantalla;
    }

    public Ordenador(String marca, float precio, int ram, int procesador, boolean pantalla) {
        this.marca = marca;
        this.precio = precio;
        this.ram = ram;
        this.procesador = procesador;
        this.pantalla = pantalla;
    }
}

public class ObjectArrays {
    public static void main(String[] args) {
        Ordenador pedido[] = new Ordenador[4];
        pedido[0] = new Ordenador("Asus", 1000, 8, 8, true);
        pedido[1] = new Ordenador("Asus", 1200, 12, 12, true);
        pedido[2] = new Ordenador("Dell", 800, 8, 4, false);
        pedido[3] = new Ordenador("Apple", 2250, 16, 12, true);
        float cuenta = 0.0f;

        for (Ordenador pc : pedido) {
            System.out.println("Marca: " + pc.getMarca());
            System.out.println("Precio: " + pc.getPrecio());
            System.out.println("RAM: " + pc.getRam());
            System.out.println("Procesador: " + pc.getProcesador());
            System.out.println("Pantalla: " + pc.isPantalla());
            System.out.println("\n");
            cuenta+= pc.getPrecio();
        }
        System.out.println("La cuenta es: "+cuenta+"€");
    }
}
