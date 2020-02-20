package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import java.util.Locale;

/* 
Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
•	Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/

public class Solution {

    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Vert", df.parse("JANUARY 1 1980"));
        map.put("Tert", df.parse("FEBRUARY 1 1980"));
        map.put("Sert", df.parse("MARCH 1 1980"));
        map.put("Freg", df.parse("APRIL 1 1980"));
        map.put("Meg", df.parse("MAY 1 1980"));
        map.put("Geg", df.parse("JULY 1 1980"));
        map.put("Cert", df.parse("AUGUST 1 1980"));
        map.put("Refg", df.parse("SEPTEMBER 1 1980"));
        map.put("Bert", df.parse("OCTOBER 1 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
         Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Date> pair = iterator.next();
            if (pair.getValue().toString().contains("Jun")){
                iterator.remove();
            }else if (pair.getValue().toString().contains("Jul")){
                iterator.remove();
            }
            else if (pair.getValue().toString().contains("Aug")){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}