package com.javarush.task.task10.task1013;
import java.io.*;
import java.util.*;
/* 
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	В классе Human должно быть 6 полей.
•	Все поля класса Human должны быть private.
•	В классе Human должно быть 10 конструкторов.
•	Все конструкторы класса Human должны быть public.
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int rosr;
        private int wes;
        private int age;
        private Date dr;
        private char telefon;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int rosr) {
            this.name = name;
            this.rosr = rosr;
        }

        public Human(String name, int rosr, int wes) {
            this.name = name;
            this.rosr = rosr;
            this.wes = wes;
        }

        public Human(String name, int rosr, int wes, int age) {
            this.name = name;
            this.rosr = rosr;
            this.wes = wes;
            this.age = age;
        }

        public Human(String name, int rosr, int wes, int age, Date dr) {
            this.name = name;
            this.rosr = rosr;
            this.wes = wes;
            this.age = age;
            this.dr = dr;
        }

        public Human(String name, int rosr, int wes, int age, Date dr, char telefon) {
            this.name = name;
            this.rosr = rosr;
            this.wes = wes;
            this.age = age;
            this.dr = dr;
            this.telefon = telefon;
        }
        public Human() {
        }

        public Human(Date dr) {
            this.dr = dr;
        }

        public Human(char telefon) {
            this.telefon = telefon;
        }

        public Human(int wes) {
            this.wes = wes;
        }
    }
}
