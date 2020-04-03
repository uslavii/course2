package com.company.homework.temperatureConverter;

public class Fahrenheit implements Converter {
    @Override
    public double convert(int celsius) {
        double result = 0;
        result = (celsius*1.8) + 32;
        return result;
    }
}
