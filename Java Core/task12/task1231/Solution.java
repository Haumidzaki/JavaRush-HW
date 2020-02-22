package com.javarush.task.task12.task1231;

/* 
Ненужные абстракции
Необходимо расставить правильно ключевые слова abstract, чтобы программа компилировалась.
Добавь там где надо и удали там, где они не нужны.

Требования:
•	Класс Pegasus должен реализовывать интерфейс CanFly.
•	Класс Pegasus должен наследоваться от класса Horse.
•	Класс SwimmingPegasus должен наследоваться от класса Pegasus.
•	Обьект класса Horse создать можно.
•	Обьект класса Pegasus создать можно.
•	Метод swim() класса SwimmingPegasus не должен иметь реализации.
*/

public class Solution {

    public static void main(String[] args) {
        Horse horse = new Pegasus();
        horse.run();
    }

    public static interface CanFly {
        public abstract void fly();
    }

    public static abstract class Horse {
        public void run() {

        }
    }

    public static class Pegasus extends Horse implements CanFly {
        public abstract void fly() {

        }
    }

    public static class SwimmingPegasus extends Pegasus {
        public void swim();
    }
}