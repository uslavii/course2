package com.company.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Task8 {
    static class ConsoleReader {
        public String readString(String console) throws IOException {
            return console;
        }

        public int readInt(String console) throws IOException {
            Pattern pattern = Pattern.compile("[0-9]");
            if (console.matches(String.valueOf(pattern))) {
                System.out.println("вы ввели неправильные символы");
                return 0;
            }
            int result = Integer.parseInt(console);
            return result;
        }

        public double readDouble(String console) throws IOException {
            if (console.matches("[.]")) {
                System.out.println("вы ввели не дробное число. используйте другой метод");
                return 0;
            }
            double result = Double.parseDouble(console);
            return result;
        }

        public void readLn(String console) throws IOException {
            if (console.matches("/n")) {
                System.out.println("неверно!");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ConsoleReader consoleReader = new ConsoleReader();
        System.out.println("введите любой текст");
        String console = reader.readLine();
        System.out.println(consoleReader.readString(console));
        System.out.println("введите число");
        console = reader.readLine();
        System.out.println(consoleReader.readInt(console));
        System.out.println("введите дробное число");
        console = reader.readLine();
        System.out.println(consoleReader.readDouble(console));
        System.out.println("нажмите enter");
        console = reader.readLine();
        consoleReader.readLn(console);
    }
}
