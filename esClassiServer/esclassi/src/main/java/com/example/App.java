package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import main.java.com.example.entitaclasse;

public class App {
    public static void main(String[] args) {
        try {
            System.out.println("Server started and waiting for connections...");
            ServerSocket server = new ServerSocket(3000);
            ObjectMapper obj = new ObjectMapper();
            //ArrayList<MyThread> threads = new ArrayList<>();

                Socket client = server.accept();
                BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(server.getInputStream()));
                BufferedReader out = new DataOutputStream(server.getOutputStream());
            alunno a = new alunno("Giovanni", "Moscardini", "25/02/2005");
            alunno b = new alunno("Paolo", "Pippolino", "22/07/2005");
            alunno c = new alunno("Gilbert", "Nana", "18/09/2005");

            entitaclasse classe = new entitaclasse("5CIA");
            
            String S1 = obj.writeValueAsString(a);
            System.out.println(S1);

            classe.aggiungiAlunno(a);
            classe.aggiungiAlunno(b);
            classe.aggiungiAlunno(c);
            
            out.writeByte(classe.toString());
            System.out.println(classe.toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
