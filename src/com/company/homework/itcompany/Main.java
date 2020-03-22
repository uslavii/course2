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
        while (!line.matches("/n")) {
            line = reader.readLine();
            employeeInitialization(line);
            continue;
        }
    }

    private static void employeeInitialization(String input) {
        switch (input) {
            case "manager":
                Manager manager = new Manager();
                manager.information();
                break;
            case "developer":
                Developer developer = new Developer();
                developer.information();
                break;
            case "designer":
                Designer designer = new Designer();
                designer.information();
                break;
            case "tester":
                Tester tester = new Tester();
                tester.information();
                break;
            default:
                System.out.println("pls choose manager,designer,developer or tester");
                break;
        }
    }
}
