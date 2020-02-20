package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
Создать 5 зергов, 3 протосса и 4 террана.
Дать им всем уникальные имена.

Требования:
•	Нельзя изменять классы Zerg, Protoss и Terran.
•	Нужно создать 5 объектов типа Zerg и каждому из них дать свое имя.
•	Нужно создать 3 объекта типа Protoss и каждому из них дать свое имя.
•	Нужно создать 4 объекта типа Terran и каждому из них дать свое имя.
*/

public class Solution {
    public static void main(String[] args) {
     Zerg zerg = new Zerg ();
     zerg.name = "Z1";
     Zerg zerg1 = new Zerg ();
     zerg1.name = "Z2";
     Zerg zerg2 = new Zerg ();
     zerg2.name = "Z3";
     Zerg zerg3 = new Zerg ();
     zerg3.name = "Z4";
     Zerg zerg4 = new Zerg ();
     zerg4.name = "Z5";
     Terran terran = new Terran ();
     terran.name = "Z6";
     Terran terran1 = new Terran ();
     terran1.name = "Z7";
     Terran terran2 = new Terran ();
     terran2.name = "Z8";
     Terran terran3 = new Terran ();
     terran3.name = "Z9";
     Protoss protoss = new Protoss ();
     protoss.name = "Z10";
     Protoss protoss1 = new Protoss ();
     protoss1.name = "Z11";
     Protoss protoss2 = new Protoss ();
     protoss2.name = "Z12";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}