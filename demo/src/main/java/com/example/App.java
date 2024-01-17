package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Socket s;
        BufferedReader in;
        DataOutputStream out;


        try{

            s = new Socket("localhost",3000);
            in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            out = new DataOutputStream(s.getOutputStream());

            String str = in.readLine();
            System.out.println(str);
            XmlMapper xml = new XmlMapper();
                
            Class class1 = xml.readValue(str, Class.class);
            System.out.println("_____________class1_________________");
            System.out.println(class1.getNumero() + class1.getSezione());

            str = in.readLine();
            ObjectMapper obj= new ObjectMapper();
                
            Class class2 = obj.readValue(str, Class.class);
            System.out.println("_____________class2_________________");
            System.out.println(class2.getNumero() + class2.getSezione());


        }
        catch(Exception e){

            System.out.println("errore");

        }


    }
}
