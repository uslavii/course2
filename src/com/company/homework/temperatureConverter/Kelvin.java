package com.company.homework.temperatureConverter;

public class Kelvin implements Converter {

    @Override
    public double convert(int celsius) {
        double result = 0;
        result = celsius + 273.15;
        return result;
    }
}
