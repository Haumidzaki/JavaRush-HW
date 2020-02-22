package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* 
Нашествие исключений
Заполни список exceptions десятью(10) различными исключениями.
Первое исключение уже реализовано в методе initExceptions.

Требования:
•	Список exceptions должен содержать 10 элементов.
•	Все элементы списка exceptions должны быть 
исключениями(потомками класса Throwable).
•	Все элементы списка exceptions должны быть уникальны.
•	Метод initExceptions должен быть статическим.
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }


        exceptions.add(new IOException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new NullPointerException());
        exceptions.add(new NegativeArraySizeException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new ClassCastException());
        exceptions.add(new NoSuchElementException());

    }
}