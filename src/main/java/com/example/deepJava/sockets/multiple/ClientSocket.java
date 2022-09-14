package com.example.deepJava.sockets.multiple;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.rmi.UnknownHostException;

public class ClientSocket {

    public static String readMessage() throws IOException {
        System.out.printf("\n->");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public static void main(String[] args) throws UnknownHostException, IOException {
        try(Socket socket = new Socket("localhost",8090);
            DataOutputStream test = new DataOutputStream(socket.getOutputStream())) {
            String message = null;
            do {
                message = readMessage();
                test.writeUTF(message);
            } while (!"finish".equals(message));
        }
    }
}
