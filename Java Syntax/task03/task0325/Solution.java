package com.javarush.task.task03.task0325;

import java.io.*;
/* 
Финансовые ожидания
Ввести с клавиатуры число n.
Вывести на экран надпись "Я буду зарабатывать $n в час".

Пример:
Я буду зарабатывать $50 в час

Требования:
•	Программа должна выводить текст.
•	Программа должна считывать данные с клавиатуры.
•	Выведенный текст должен содержать введенное число n.
•	Выведенный тест должен полностью соответствовать заданию.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
       String n = b.readLine();
       System.out.println("Я буду зарабатывать $"+n+ " в час");
    }
}