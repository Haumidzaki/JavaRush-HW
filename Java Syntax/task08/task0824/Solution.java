package com.javarush.task.task08.task0824;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).

Требования:
•	Программа должна выводить текст на экран.
•	Класс Human должен содержать четыре поля.
•	Класс Human должен содержать один метод.
•	Класс Solution должен содержать один метод.
•	Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human human = new Human();
        human.age = 55;
        human.name = "Вася";
        human.sex = true;


        Human human1 = new Human();
        human1.age = 75;
        human1.name = "Дима";
        human1.sex = true;

        Human human2 = new Human();
        human2.age = 66;
        human2.name = "Лиза";
        human2.sex = false;

        Human human3 = new Human();
        human3.age = 63;
        human3.name = "Вика";
        human3.sex = false;

        Human human4 = new Human();
        human4.age = 33;
        human4.name = "Оля";
        human4.sex = false;

        Human human5 = new Human();
        human5.age = 35;
        human5.name = "Виктор";
        human5.sex = true;

        Human human6 = new Human();
        human6.age = 15;
        human6.name = "Слава";
        human6.sex = true;

        Human human7 = new Human();
        human7.age = 12;
        human7.name = "Женя";
        human7.sex = true;

        Human human8 = new Human();
        human8.age = 11;
        human8.name = "Екатерина";
        human8.sex = false;

        human.children.add(human4);
        human2.children.add(human4);
        human1.children.add(human5);
        human3.children.add(human5);
        human4.children.add(human6);
        human4.children.add(human7);
        human4.children.add(human8);
        human5.children.add(human6);
        human5.children.add(human7);
        human5.children.add(human8);

        System.out.println(human.toString());
        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());
        System.out.println(human6.toString());
        System.out.println(human7.toString());
        System.out.println(human8.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}