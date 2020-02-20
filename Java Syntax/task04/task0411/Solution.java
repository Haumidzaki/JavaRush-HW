package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
Напишите метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.

Пример для номера месяца 2:
зима

Пример для номера месяца 5:
весна

Требования:
•	Программа должна выводить текст на экран.
•	Метод main не должен вызывать функцию System.out.println или System.out.print.
•	Метод main должен вызывать метод checkSeason.
•	Метод checkSeason должен быть static void, и иметь только один параметр int.
•	Метод checkSeason должен выводить текст на экран согласно заданию.
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
       if((month >= 9) & (month < 12)){
           System.out.println("осень");
       }else if ((month >= 3) & (month < 6)){
           System.out.println("весна");
       }else if ((month >= 6) & (month < 9)){
           System.out.println("лето");
       }else{
           System.out.println("зима");
       }
    }
}