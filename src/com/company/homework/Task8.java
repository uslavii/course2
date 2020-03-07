package com.company.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Task8 {

    static class ConsoleReader {
        public String readString() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String result = reader.readLine();
            return result;
        }

        public int readInt() throws IOException {
            Pattern pattern = Pattern.compile("[0-9]");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("введите число");
            String console = reader.readLine();
            if (console.matches(String.valueOf(pattern))) {
                System.out.println("вы ввели неправильные символы");
                return 0;
            }
            int result = Integer.parseInt(console);
            return result;
        }

        public double readDouble() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("введите дробное число");
            String console = reader.readLine();
            if (console.matches("[.]")) {
                System.out.println("вы ввели не дробное число. используйте другой метод");
                return 0;
            }
            double result = Double.parseDouble(console);
            return result;
        }

        public void readLn() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("нажмите enter");
            String console = readString();
            if (console.matches("/n")) {
                System.out.println("неверно!");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        ConsoleReader consoleReader = new ConsoleReader();
        System.out.println(consoleReader.readString());
        System.out.println(consoleReader.readInt());
        System.out.println(consoleReader.readDouble());
        consoleReader.readLn();
    }
}
