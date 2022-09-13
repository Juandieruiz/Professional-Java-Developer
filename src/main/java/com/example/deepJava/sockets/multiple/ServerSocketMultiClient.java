package com.example.deepJava.sockets.multiple;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class WorkerSocket extends Thread {
    private Socket client;

    public WorkerSocket(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try (DataInputStream msg = new DataInputStream(client.getInputStream());) {
            String message = null;
            do {
                message = msg.readUTF();
                System.out.printf("%s Dice: %s \n", client.getInetAddress().getHostName(), message);
            } while (!"finish".equals(message));

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}

public class ServerSocketMultiClient {
    public static void main(String[] args) throws IOException {
        try (ServerSocket ss = new ServerSocket(8090);) {
            while (true) {
                System.out.println("Escuchando clientes");
                Socket client = ss.accept();
                System.out.println("Cliente Conectado: "+ client.getInetAddress().getHostName());
                new WorkerSocket(client).start();
            }
        }
    }
}
