package com.example.deepJava.exceptions;

/**
 * Reglas al utilizar throw y throws
 * - cuando se hereda de una clase que tiene una excepcion, se debe utilizar throws
 * - Throws es necesario solo para excepciones de tipo checked.
 * - Cuando se sobrescribe un metodo, no es posible agregrar un throws con una excepcion nueva de tipo checked.
 * - Cuando se llega a una linea con throw la ejecucion se detiene y comienza a progpagar la excepcion.
 * - Si la excepcion no es manejada por ningun metodo, será manejada por la  JVM
 * - Un metodo puede declarar mas de una excepcion con la palabra reservada throws
 * - Se puede utilizar throw solo con objetos de tipo Throwable
 *
 */
class Foo{
    void print() throws Exception{
        throw new Exception(); // Debe ser throwable
    }
}

class Bar extends Foo{

    @Override
    void print(){ // la clase hija no puede redefinir un método que la clase padre no puede sobreescribir
        System.out.println("Bar");
    }
}

public class HerencyThrows {

}
