package com.javarush.task.task04.task0405;

/* 
Задаем количество котов
Напишите метод setCatsCount. Метод должен устанавливать количество котов (catsCount).

Требования:
•	Класс Cat должен содержать только одну переменную catsCount.
•	Переменная catsCount должна быть статической, иметь модификатор доступа private, тип int и проинициализирована нулем.
•	Класс Cat должен содержать два метода setCatsCount и main.
•	Метод setCatsCount класса Cat должен устанавливать значение переменной catsCount равным переданному параметру.
*/

public class Cat {
    private static int catsCount;

    public static void setCatsCount(int catsCount) {
        Cat.catsCount = catsCount;
    }

    public static void main(String[] args) {

    }
}