package com.company.homework.temperatureConverter;

import com.company.homework.zoo.Element;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please click on k to convert to kelvin or f to convert to fahrenheit");
        String input = reader.readLine();
        Converter converter = conversionSelection(input);
        System.out.println("please enter the number of degrees centigrade");
        int celsius = Integer.parseInt(reader.readLine());
        System.out.println(converter.convert(celsius));
    }


    public static Converter conversionSelection(String input) {
        switch (input) {
            case "f":
                return new Fahrenheit();
            case "k":
                return new Kelvin();
            default:
                System.out.println("pls enter correct char");
                break;
        }
        return new Converter() {
            @Override
            public double convert(int celsius) {
                return 0;
            }
        };
    }

}
