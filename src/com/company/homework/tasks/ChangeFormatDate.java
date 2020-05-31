package com.company.homework.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class ChangeFormatDate {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String localDateString = reader.readLine();
        LocalDate date = LocalDate.parse(localDateString, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println(date.format(DateTimeFormatter.ofPattern("LLL dd,yyyy",Locale.ENGLISH)));



    }
}