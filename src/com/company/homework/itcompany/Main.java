package com.company.homework.itcompany;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("pls choose manager,designer,developer or tester");
        String line = " ";
        while (!line.matches("")) {
            line = reader.readLine();
            employeeInitialization(line).information();
        }
    }

    private static AbstractEmployee employeeInitialization(String input) {
        switch (input) {
            case "manager":
                return new Manager();
            case "developer":
                return new Developer();
            case "designer":
                return new Designer();
            case "tester":
                return new Tester();
            case "":
                System.out.println("thanks for using!");
                break;
            default:
                System.out.println("pls choose manager,designer,developer or tester");
        }
        return new AbstractEmployee() {
            @Override
            public void information() {

            }
        };
    }
}
