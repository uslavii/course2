package com.company.homework.ioStream;

import java.io.*;

public class User {

    private String name;
    private int age;
    private String city;

    private User() {
    }

    public User(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public void write() throws IOException {
        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(name+".txt"))) {
            dataOutputStream.writeUTF(name+","+age+","+city);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read() throws IOException {
        try (InputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\svato\\" +
                "IdeaProjects\\course2\\" + name + ".txt"))) {
            while (bufferedInputStream.available() > 0) {
                char ch = (char) bufferedInputStream.read();
                System.out.print(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
