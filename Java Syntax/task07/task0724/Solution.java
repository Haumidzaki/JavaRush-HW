package com.javarush.task.task07.task0724;

/* 
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
•	Добавить в класс конструктор public Human(String name, boolean sex, int age).
•	Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
•	Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
•	Выведи созданные объекты на экран.
*/

public class Solution {

    public static void main(String[] args) {
    Human human1 = new Human("Игорь",true,60);
        Human human2 = new Human("Вадим",true,60);
        Human human3 = new Human("Лиза",false,60);
        Human human4 = new Human("Света",false,60);
        Human human5 = new Human("Ольга",false,35,human1,human3);
        Human human6 = new Human("Виктор",true,40,human2,human4);
        Human human7 = new Human("Вика",false,10,human6,human5);
        Human human8 = new Human("Слава",false,8,human6,human5);
        Human human9 = new Human("Дима",true,12,human6,human5);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println(human7);
        System.out.println(human8);
        System.out.println(human9);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}