package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address

Требования:
•	В классе Solution создай public static класс Man.
•	В классе Solution создай public static класс Woman.
•	Класс Man должен содержать переменные: name(String), age(int) и address(String).
•	Класс Woman должен содержать переменные: name(String), age(int) и address(String).
•	У классов Man и Woman должны быть конструкторы, принимающие параметры с типами String, int и String.
•	Конструкторы должны инициализировать переменные класса.
•	В методе main необходимо создать по два объекта каждого типа.
•	Метод main должен выводить созданные объекты на экран в указанном формате.
*/

public class Solution {
    public static void main(String[] args) {
       Man man = new  Man("Toni", 12,"232321");
       System.out.println( man.name + " " + man.age + " " + man.address);
       Man man1 = new  Man("Ton", 44,"5647456");
       System.out.println( man1.name + " " + man1.age + " " + man1.address);
       Woman woman = new  Woman("Ton33", 23,"234234");
       System.out.println( woman.name + " " + woman.age + " " + woman.address);
       Woman woman1 = new  Woman("T234", 44,"2342345");
       System.out.println( woman1.name + " " + woman1.age + " " + woman1.address);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}