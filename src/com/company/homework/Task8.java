package com.company.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Task8 {
    static class ConsoleReader {
        private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        private static String console ;

        ConsoleReader() throws IOException {
        }

        public static String readString() throws IOException {
            console = reader.readLine();
            return console;
        }

        public static int readInt() throws IOException {
            console = reader.readLine();
            Pattern pattern = Pattern.compile("[0-9]");
            if (console.matches(String.valueOf(pattern))) {
                System.out.println("вы ввели неправильные символы");
                return 0;
            }
            int result = Integer.parseInt(console);
            return result;
        }

        public static double readDouble() throws IOException {
            console = reader.readLine();
            if (console.matches("[.]")) {
                System.out.println("вы ввели не дробное число. используйте другой метод");
                return 0;
            }
            double result = Double.parseDouble(console);
            return result;
        }

        public static void readLn() throws IOException {
            console = reader.readLine();
            if (console.matches("/n")) {
                System.out.println("неверно!");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        ConsoleReader consoleReader = new ConsoleReader();
        System.out.println("введите любой текст");
        System.out.println(consoleReader.readString());
        System.out.println("введите число");
        System.out.println(consoleReader.readInt());
        System.out.println("введите дробное число");
        System.out.println(consoleReader.readDouble());
        System.out.println("нажмите enter");
        consoleReader.readLn();
    }
}
