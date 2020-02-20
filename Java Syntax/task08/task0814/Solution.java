package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/* 
Больше 10? Вы нам не подходите
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Класс Solution должен содержать только три метода.
•	Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
•	Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
*/

public class Solution {

    public static HashSet<Integer> createSet() {
        HashSet<Integer>set = new HashSet<Integer>();

        for (int i = 0; i <20; i++){
            set.add(i);
        }
        return set;

    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
      Iterator<Integer> it = set.iterator();

        while (it.hasNext()){
            int s = it.next();
            if (s>10&(set.contains(s))){
                it.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {

    }
}