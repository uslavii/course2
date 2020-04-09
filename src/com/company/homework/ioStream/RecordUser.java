package com.company.homework.ioStream;

import java.io.*;

public class RecordUser {
   private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public void write() throws IOException {
        System.out.println("pls enter name");
        String name = reader.readLine();
        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(name+".txt"))) {
            System.out.println("age:");
            String age = reader.readLine();
            System.out.println(" and city where live this person ");
            String city = reader.readLine();
            dataOutputStream.writeUTF(name+","+age+","+city);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
