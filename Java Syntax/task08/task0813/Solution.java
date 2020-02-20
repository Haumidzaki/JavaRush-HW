package com.javarush.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;

/* 
20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".

Требования:
•	Не изменяй заголовок метода createSet().
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createSet() должен создавать и возвращать множество (реализация HashSet).
•	Множество из метода createSet() должно содержать 20 слов на букву «Л».
*/

public class Solution {

    public static Set<String> createSet() {
     Set<String>set = new HashSet<>();
        set.add("Л");
        set.add("Л1");
        set.add("Л2");
        set.add("Л3");
        set.add("Л4");
        set.add("Л5");
        set.add("Л6");
        set.add("Л7");
        set.add("Л8");
        set.add("Л9");
        set.add("Л10");
        set.add("Л11");
        set.add("Л12");
        set.add("Л13");
        set.add("Л14");
        set.add("Л15");
        set.add("Л16");
        set.add("Л17");
        set.add("Л18");
        set.add("Л19");
     return set;
    }

    public static void main(String[] args) {

    }
}