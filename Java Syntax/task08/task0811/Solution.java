package com.javarush.task.task08.task0811;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Квартет «Методы»
Реализовать 4 метода.
Каждый из них должен возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций).
Ничего измерять не нужно.

Требования:
•	Программа не должна выводить текст на экран.
•	Класс Solution должен содержать только 5 методов.
•	Метод getListForGet должен возвращать список, который лучше всего подходит для операции взятия элемента.
•	Метод getListForSet должен возвращать список, который лучше всего подходит для установки значения элемента.
•	Метод getListForAddOrInsert должен возвращать список, который лучше всего подходит для операций добавления или вставки элемента.
•	Метод getListForRemove должен возвращать список, который лучше всего подходит для операции удаления элемента.
*/

public class Solution {

   public static List getListForGet() {
        List<Object>list =  new ArrayList<>();
       return  list;

    }

    public static List getListForSet() {
        List<Object>list =  new ArrayList<>();
        return list;
    }

    public static List getListForAddOrInsert() {
        List<Object>list = new LinkedList<>();
        return list;

    }

    public static List getListForRemove() {
        List<Object>list = new LinkedList<>();
        return list;

    }

    public static void main(String[] args) {

    }
}