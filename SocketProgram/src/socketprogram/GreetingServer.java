package Client.java;

import java.net.*;
import java.io.*;
import java.util.Scanner;

// Made by Hari Krishna Shah

public class GreetingServer extends Thread {
    private ServerSocket serverSocket;

    public GreetingServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(100000);
    }

    public void run() {
        while (true) {
            try {
                int factorial = 1;
                System.out.println("Waiting for client on port " + serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();
                System.out.println("Just connected to " + server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());

                Integer x = in.readInt();
                System.out.println("Received number is : " + x);
   

                // System.out.println(x);
                // System.out.println(y);

                for(int i = 1; i<=x; i++)
                {
                    factorial = factorial*i;
                }
                System.out.println("The factorial is : " + factorial + ".");
                DataOutputStream out = new DataOutputStream(server.getOutputStream());

                // System.out.println(sum);
                out.write(factorial);

                server.close();
            } catch (SocketTimeoutException s) {
                System.out.println("Socket timed out!");
                break;
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Program Made by Hari Krishna Shah.");
        System.out.println("Please specify a port number (1~65535): ");
        String port;
        port = userInput.next();

        try {
            Thread t = new GreetingServer(Integer.parseInt(port));
            t.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}