package com.javarush.task.task01.task0130;

/* 
Наш первый конвертер!
Метод convertCelsiusToFahrenheit(int celsius) принимает значение в градусах Цельсия. Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TF = (9 / 5) * TC + 32

Пример:
В метод convertCelsiusToFahrenheit на вход подается значение 41.

Пример вывода:
105.8

Требования:
•	Метод convertCelsiusToFahrenheit(int) должен быть публичным и статическим.
•	Метод convertCelsiusToFahrenheit должен возвращать значение типа double.
•	Метод convertCelsiusToFahrenheit не должен ничего выводить на экран.
•	Метод convertCelsiusToFahrenheit должен правильно переводить градусы Цельсия в градусы Фаренгейта и возвращать это число.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(90));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
      return ((double)celsium * 9 / 5) + 32;
    }
}