package com.javarush.task.task02.task0214;

/* 
Минимум двух чисел
Написать функцию, которая возвращает минимум из двух чисел.

Подсказка:
Нужно написать тело существующей функции min.

Требования:
•	Программа должна выводить текст на экран.
•	Метод min не должен выводить текст на экран.
•	Метод main должен вызвать метод min три раза.
•	Метод main должен выводить на экран результат работы метода min. Каждый раз с новой строки.
•	Метод min должен возвращать минимальное значение из чисел a и b.
*/

public class Solution {
    public static int min(int a, int b) {
        if (a > b)
          return b;
        else 
          return a;  
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}