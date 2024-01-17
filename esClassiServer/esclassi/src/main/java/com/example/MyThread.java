package main.java.com.example;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class MyThread extends Thread {
    private Socket client;
    private ArrayList<MyThread> threads;
    private DataOutputStream out;
    private String clientName;

    public MyThread(Socket socket, ArrayList<MyThread> threads) {
        this.client = socket;
        this.threads = threads;
    }

    public void run() {
        try {
            BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(client.getInputStream()));
            out = new DataOutputStream(client.getOutputStream());
            ObjectMapper obj = new ObjectMapper();
            
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
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}