package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.*;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
•	Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
•	Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/

public class Solution {

     public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>(); //напишите тут ваш код
        map.put("Иванов","Сергей");
        map.put("Петров","Вадим");
        map.put("Крючков","Дмитрий");
        map.put("Зибрин","Артём");
        map.put("Володин","Сергей");
        map.put("Терешов","Роман");
        map.put("Сергеев","Евгений");
        map.put("Романов","Илья");
        map.put("Булгаков","Фёдор");
        map.put("Толстой","Сергей");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String>list = new ArrayList<>();

        for (Map.Entry<String,String> li: map.entrySet()) {
            list.add(li.getValue());
        }
        Collections.sort(list);

        for (int i = 1; i<list.size(); i++){
            if (list.get(i-1).equals(list.get(i))){
                removeItemFromMapByValue(map,list.get(i));
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);

        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
       
    }
}