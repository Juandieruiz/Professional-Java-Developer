package com.example.deepJava.collections;

class BeanGenerico<T>{
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
        BeanGenerico<String> bean = new BeanGenerico<>("Diego");
        System.out.println(bean.getValor());
        //bean.setValor(14); no es válido porque no es un string
        bean.setValor("juandieruiz");
        System.out.println(bean.getValor());
    }
}
