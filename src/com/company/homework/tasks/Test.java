package com.company.homework.tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        //Напишите тут ваш код
        String st = null;
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;

        //сначала ставим цикл перебора значений массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                //потом сравниваем строки типа стринг
                if (isGreaterThen(array[j], array[i]))
                {
                    //Если это не число, то сортируем
                    if (!isNumber(array[i]))
                    {
                        st = array[i];
                        array[i] = array[j];
                        array[j] = st;
                    }
                }

                //потом, если два значения являются числами...
                if (isNumber(array[i]) && isNumber(array[j]))
                {
                    //то записываем каждое в свою переменную...
                    num1 = Integer.parseInt(array[i]);
                    num2 = Integer.parseInt(array[j]);
                    //и сравниваем их
                    if (num1>num2)
                    {
                        st = array[j];
                        array[j] = array[i];
                        array[i] = st;
                    }
                }
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        for (char c : s.toCharArray())
        {
            if (!Character.isDigit(c) && c != '-') return false;
        }
        return true;
    }
}
