package com.example.deepJava.collections;

class Transporte {
}

class Coche extends Transporte {
}

class Deportivo extends Coche {
}

// Vamos a limitar este bean para que esté enlazado con una clase que sea hija de Transporte
class BeanGenerico<T extends Transporte> {
    private T valor;

    public BeanGenerico(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
}


public class GenericoTest {
    public static void main(String[] args) {
        // Si especificamos el tipo de bean.. -> String, Integer... le dará una norma de tipo de dato
        BeanGenerico<Transporte> bean = new BeanGenerico<>(new Transporte());
        BeanGenerico<Deportivo> beanx = new BeanGenerico<>(new Deportivo());

        System.out.println(bean.getValor());
        //bean.setValor(14); no es válido porque no es un string
        System.out.println(bean.getValor());
    }
}
