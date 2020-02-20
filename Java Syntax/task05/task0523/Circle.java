package com.javarush.task.task05.task0523;

/* 
Конструктор
Разберись, что делает программа.
Найди и исправь одну ошибку в классе Circle. Метод main изменять нельзя.

Подсказка:
изучи конструктор по умолчанию.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Метод main изменять нельзя.
•	Программа должна вывести слово "Red" на экран.
•	Метод getDescription класса Color должен возвращать значение переменной description.
•	Метод setDescription класса Color должен устанавливать значение переменной description.
*/

public class Circle {
    public Color color = new Color();

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public void Circle() {
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}