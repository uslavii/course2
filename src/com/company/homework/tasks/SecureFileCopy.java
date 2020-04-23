package com.company.homework.tasks;

import java.io.*;

public class SecureFileCopy {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        String nameFileNeedBeChange = reader.readLine();
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(nameFile);

        } catch (Exception e) {
            System.out.println("Файл не существует");
            nameFile = reader.readLine();
            inputStream = new FileInputStream(nameFile);
        }
        FileOutputStream outputStream = new FileOutputStream(nameFileNeedBeChange);
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            outputStream.write(data);
        }
    }

}
