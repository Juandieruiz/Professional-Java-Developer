package com.example.deepJava.threads;

class Counter implements Runnable {
    private int value;

    public Counter(int value) {
        this.value = value;
    }

    @Override
    public void run() {
        for (int i = value; i >= 0; i--) {
            System.out.printf("%s Valor %d \n", Thread.currentThread().getName(), i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }

    }
}

public class JuandieruizCounter {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Counter(10), "Hilo 1");
        thread.start();
        Thread thread2 = new Thread(new Counter(20), "Hilo 2");
        thread2.start();
        System.out.println("Iniciazion de Hilos");
        thread.join();
        thread2.join();
        System.out.println("Fin del programa");
    }
}
