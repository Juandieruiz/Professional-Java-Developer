package com.example.deepJava.threads;

class JuandieruizThread extends Thread {
    public JuandieruizThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Hilo %s indice %d \n", getName(), i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadConstruction {
    public static void main(String[] args) {
        JuandieruizThread thread1 = new JuandieruizThread("Hilo 1");
        JuandieruizThread thread2 = new JuandieruizThread("Hilo 2");

        thread1.start();
        thread2.start();
    }
}
