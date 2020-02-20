package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
Есть класс кот - Cat, с полем "имя" (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
Получить из Map множество(Set) всех котов и вывести его на экран.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Метод createMap должен создавать новый объект HashMap<String, Cat>.
•	Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
•	Метод createMap должен возвращать созданный словарь.
•	Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
•	Программа должна вывести всех котов из множества на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String,Cat> map = new HashMap<>();
        map.put("Васька",new Cat("Васька"));
        map.put("Мурка",new Cat("Мурка"));
        map.put("Пушок",new Cat("Пушок"));
        map.put("Дымка",new Cat("Дымка"));
        map.put("Пятно",new Cat("Пятно"));
        map.put("Рыжик",new Cat("Рыжик"));
        map.put("Чижик",new Cat("Чижик"));
        map.put("Пыжик",new Cat("Пыжик"));
        map.put("Пирожок",new Cat("Пирожок"));
        map.put("Бегимот",new Cat("Бегимот"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set  = new HashSet<>();
       for (Map.Entry<String,Cat> entry : map.entrySet()){
           set.add(entry.getValue());
       }
       return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}