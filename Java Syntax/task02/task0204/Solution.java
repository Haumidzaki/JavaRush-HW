package com.javarush.task.task02.task0204;

/* 
О семейных отношениях
В методе main создай объект Man, сохрани ссылку на него в переменную man.
Создай также объект Woman и сохрани ссылку на него в переменную woman.

Подсказка: для создания объекта Woman и занесения его ссылки в переменную woman используй конструкцию:
ТипПеременной имяПеременной = new ТипСоздаваемогоОбъекта();
В man.wife сохрани ссылку на ранее созданный объект Woman.
В woman.husband сохрани ссылку на ранее созданный объект Man (подсказка: woman.husband = man;).

Требования:
•	В методе main создай объект Man и сразу сохрани ссылку на него в переменную man.
•	В методе main создай объект Woman и сразу сохрани ссылку на него в переменную woman.
•	В методе main сохрани ссылку на ранее созданный объект Woman в man.wife.
•	В методе main сохрани ссылку на ранее созданный объект Man в woman.husband.
•	Класс Man должен содержать 3 переменные
•	Класс Woman должен содержать 3 переменные
*/

public class Solution {
    public static void main(String[] args) {
    Man man = new Man();
    Woman woman = new Woman();
    woman.husband = man;
    man.wife = woman;//напишите тут ваш код
    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }
}