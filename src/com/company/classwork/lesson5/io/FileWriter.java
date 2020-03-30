package com.company.classwork.lesson5.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {

    public static void main(String[] args) {

        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("fileoutput.txt"))) {

            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeUTF("Test string");
            dataOutputStream.writeInt(123);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
