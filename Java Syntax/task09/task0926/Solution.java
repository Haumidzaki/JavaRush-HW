package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов-массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Метод createList должен объявлять и инициализировать переменную типа ArrayList<int[]>.
•	Метод createList должен возвращать созданный список.
•	Метод createList должен добавлять в список 5 элементов.
•	Каждый элемент в списке должен быть массивом чисел. Длина первого должна быть 5 элементов, второго - 2, следующих - 4, 7, 0 соответственно.
•	Программа должна выводить на экран элементы всех массивов из списка. Каждый элемент с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]>  list = new ArrayList<>();
        int []  res1 = new int[]{5,3,7,8,4};
        int []  res2 = new int[]{5,3};
        int []  res3 = new int[]{5,3,7,8};
        int []  res4 = new int[]{5,3,7,8,4,7,2};
        int []  res5 = new int[0];

        list.add(res1);
        list.add(res2);
        list.add(res3);
        list.add(res4);
        list.add(res5);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}