package com.example.deepJava.collections;

import java.util.PriorityQueue;

/**
 * Siempre se usa wrapper para los tipos primitivos.
 * PriorityQueue es una cola de prioridad.
 * en este caso al ser Integer, el orden es de menor a mayor.
 */

public class TestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // offer or add agrega un elemento a la cola de prioridad.
        pq.offer(100);
        pq.offer(200);
        pq.add(5);
        pq.add(1000);

        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
    // Se usa mucho para colas de prioridad.
    }
}
