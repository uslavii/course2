package com.company.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task7 {

    static class Util {
        public static double getDistance(double x1, double y1, double x2, double y2) {
            double a = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
            return Math.sqrt(a);
        }
    }


    public static void main(String[] args) throws IOException {
        Util util = new Util();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите координату x1");
        double x1 = Double.parseDouble(reader.readLine());
        System.out.println("введите координату x2");
        double x2 = Double.parseDouble(reader.readLine());
        System.out.println("введите координату y1");
        double y1 = Double.parseDouble(reader.readLine());
        System.out.println("введите координату y2");
        double y2 = Double.parseDouble(reader.readLine());
        System.out.println(Util.getDistance(x1,y1,x2,y2));
    }

}
