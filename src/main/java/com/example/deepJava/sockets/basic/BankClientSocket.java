package com.example.deepJava.sockets.basic;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class BankClientSocket {
    public static void main(String[] args) throws UnknownHostException, IOException {
        try (Socket socket = new Socket("localhost",8090);
             DataOutputStream test = new DataOutputStream(socket.getOutputStream())) {
            test.writeUTF("Test conexión de cliente al socket");
            test.writeUTF("finish");
        }
    }
}
