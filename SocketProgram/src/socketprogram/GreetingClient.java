package Client.java;

import java.net.*;
import java.io.*;
import java.util.Scanner;

// Made by Hari Krishna Shah


public class GreetingClient {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Program Made by Hari Krishna Shah.");
        System.out.println("Enter Server Name: ");
        String serverName;
        serverName = userInput.next();

        System.out.println("Enter Port Number: ");
        String port;
        port = userInput.next();

        try {
            System.out.println("Connecting to " + serverName + " on port " + port);
            Socket client = new Socket(serverName, Integer.parseInt(port));
            System.out.println("Just connected to " + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            System.out.println("Enter a number: ");
            Integer x = userInput.nextInt();
            out.writeInt(x);

            DataOutputStream os = new DataOutputStream(client.getOutputStream());
            BufferedReader is = new BufferedReader(new InputStreamReader(client.getInputStream()));
            System.out.println("The number " + x + " has been sent to the server successfully.");
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}