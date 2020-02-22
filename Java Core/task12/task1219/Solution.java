package com.javarush.task.task12.task1219;

/* 
Создаем человека
Есть public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
Добавь эти интерфейсы классам Human(человек), Duck(утка), Penguin(пингвин), Airplane(самолет).

Требования:
•	Класс Solution должен содержать интерфейс CanFly с одним методом fly().
•	Класс Solution должен содержать интерфейс CanRun с одним методом run().
•	Класс Solution должен содержать интерфейс CanSwim с одним методом swim().
•	Человек должен уметь бегать и плавать.
•	Утка должна уметь летать, плавать и бегать.
•	Пингвин должен уметь плавать и бегать.
•	Самолет должен уметь летать и ездить.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanSwim, CanRun {
        public void run(){}
        public void swim(){}
        
    }

    public class Duck implements CanSwim, CanFly, CanRun {
        public void run(){}
        public void swim(){}
        public void fly(){}
    }

    public class Penguin implements CanRun, CanSwim {
        public void run(){}
        public void swim(){}
    }

    public class Airplane implements CanFly, CanRun {
        public void fly(){}
        public void run(){}
    }
}