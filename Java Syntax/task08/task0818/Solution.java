package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.*;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
•	Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
   public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>(); //напишите тут ваш код
        map.put("Иванов",300);
        map.put("Петров",500);
        map.put("Крючков",400);
        map.put("Зибрин",1000);
        map.put("Володин",200);
        map.put("Терешов",600);
        map.put("Сергеев",700);
        map.put("Романов",900);
        map.put("Булгаков",400);
        map.put("Толстой",700);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String,Integer>>iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Integer>pair = iterator.next();

            if (pair.getValue()<500){
               iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}