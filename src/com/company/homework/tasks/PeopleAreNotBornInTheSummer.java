package com.company.homework.tasks;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PeopleAreNotBornInTheSummer {

    public static void main(String[] args) {
        HashMap<String, LocalDate> hashMap = new HashMap<>();


        hashMap.put("slavik", LocalDate.of(2003,8,25));
        hashMap.put("misha",LocalDate.of(1998,10,14));
        hashMap.put("john",LocalDate.of(2005,1,9));
        hashMap.put("derek",LocalDate.of(2002,3,30));
        hashMap.put("marie",LocalDate.of(2003,6,26));
        hashMap.forEach((key, value) -> System.out.println(key + " " + value));
        removeAllSummerDate(hashMap);
        System.out.println();
        hashMap.forEach((key, value) -> System.out.println(key + " " + value));
    }


    public static void removeAllSummerDate(HashMap<String,LocalDate> map) {
        Iterator<Map.Entry<String, LocalDate>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, LocalDate> entry = iterator.next();
            LocalDate date = entry.getValue();
            Month month = date.getMonth();
            if (month.equals(Month.AUGUST) || month.equals(Month.JULY) || month.equals(Month.JUNE)) {
                iterator.remove();
            }
        }
    }
}
