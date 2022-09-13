package com.example.deepJava.sockets.simple;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class BankServerSocket {
    public static void main(String[] args) throws IOException {

        try (ServerSocket socket = new ServerSocket(8090)) {

            System.out.println("Socket Bancario a la espera de connexions ...");
            Socket client = socket.accept();
            System.out.printf("Cliente %s conectado \n", client.getInetAddress().getHostName());
            DataInputStream dis = new DataInputStream(client.getInputStream());
            String message = null;
            do {
                message = dis.readUTF();
                System.out.printf("%s dice : %s",client.getInetAddress().getHostName(), message);
            } while (!"finish".equals(message));
            System.out.println("Conexión finalizada.");
            socket.close();
            client.close();
            dis.close();
        }
    }

}
