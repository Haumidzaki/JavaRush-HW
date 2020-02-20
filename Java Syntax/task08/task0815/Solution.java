package com.javarush.task.task08.task0815;

import java.util.*;
import java.util.HashSet;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
•	Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
•	Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

public class Solution {

    public static HashMap<String, String> createMap() {
       HashMap<String, String>map = new HashMap<>();
       map.put("Иванов","Сергей");
       map.put("Петров","Вадим");
       map.put("Крючков","Дмитрий");
       map.put("Зибрин","Артём");
       map.put("Володин","Владимир");
       map.put("Терешов","Роман");
       map.put("Сергеев","Евгений");
       map.put("Романов","Илья");
       map.put("Булгаков","Фёдор");
       map.put("Толстой","Сергей");
       return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        Iterator<Map.Entry<String,String>>iterator = map.entrySet().iterator();
        int count = 0;

        while (iterator.hasNext()){
            Map.Entry<String,String> pair = iterator.next();
            
            if(pair.getValue().equals(name)){
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        Iterator<Map.Entry<String,String>>iterator = map.entrySet().iterator();
        int count = 0;
		
        while (iterator.hasNext()){
            Map.Entry<String,String> pair = iterator.next();
            
            if(pair.getKey().equals(lastName)){
                count++;
            }
		}
        return count;

    }

    public static void main(String[] args) {

    }
}