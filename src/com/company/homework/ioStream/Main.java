package com.company.homework.ioStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        User user = new User(reader.readLine(),Integer.parseInt(reader.readLine()),reader.readLine());
        user.write();
        user.read();
    }

}
