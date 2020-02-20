package com.javarush.task.task08.task0828;

/*
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используйте коллекции.

Требования:
•	Программа должна считывать одно значение с клавиатуры.
•	Программа должна выводить текст на экран.
•	Программа должна использовать коллекции.
•	Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthName = scanner.nextLine();
        HashMap<String,Integer> mont = new HashMap<>();

        String text = "May is the %d month";
        mont.put("January",1);
        mont.put("February",2);
        mont.put("March",3);
        mont.put("April",4);
        mont.put("May",5);
        mont.put("June",6);
        mont.put("July",7);
        mont.put("August",8);
        mont.put("September",9);
        mont.put("October",10);
        mont.put("November",11);
        mont.put("December",12);

        for(Map.Entry<String,Integer> pair : mont.entrySet()){

            if(monthName.equalsIgnoreCase(pair.getKey())){
                System.out.println(String.format(text,pair.getValue()));
            }
        }
    }
}

