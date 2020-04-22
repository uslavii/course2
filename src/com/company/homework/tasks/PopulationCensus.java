package com.company.homework.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PopulationCensus {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        addFamily(map);
        System.out.println(findFamily(map));
    }


    public static void addFamily(HashMap<String, String> map) throws IOException {
        String input = " ";
        String city ;
        String family;
        while (true) {
            input = reader.readLine();
            if (input.equals("")) {
                break;
            }
            city = input;
            input = reader.readLine();
            if (input.equals("")) {
                break;
            }
            family = input;
            map.put(city,family);
        }
    }

    public static String findFamily(HashMap<String,String> map) throws IOException {
        String input = reader.readLine();
        for (Map.Entry<String, String> entry: map.entrySet()) {
            if (input.equals(entry.getKey())) {
                return entry.getValue();
            }
        }
        throw new IllegalArgumentException("nobody lives in this city");
    }
}
