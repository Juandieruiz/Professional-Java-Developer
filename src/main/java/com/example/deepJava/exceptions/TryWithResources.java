package com.example.deepJava.exceptions;

class ResourceJuandieruiz implements AutoCloseable {

    void welcome() {
        System.out.println("Welcome to Comoserprogramador.com");
    }

    @Override
    public void close() throws Exception {
        System.out.println("sending resources");
    }
}

/**
 * try{
 *             // codigo para acceder a bbdd
 *         }catch (Exception e){
 *             // codigo en caso de error
 *     } finally {
 *             // Cerrar conexión con bbdd con.close(); (generaba excepcion y más... try)
 *         }
 */

public class TryWithResources {
    public static void main(String[] args) {
        try (ResourceJuandieruiz r = new ResourceJuandieruiz()) {
            r.welcome();
        } catch (Exception e) {
            System.out.println("error");
        }

    }
}
