package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
The cat's name is дедушка Вася, no mother, no father
The cat's name is бабушка Мурка, no mother, no father
The cat's name is папа Котофей, no mother, father is дедушка Вася
The cat's name is мама Василиса, mother is бабушка Мурка, no father
The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей

Требования:
•	Программа должна считывать имена 6 котов в указанном порядке.
•	Метод main должен создавать 6 объектов типа Cat.
•	Программа должна выводить 6 строк с информацией о котах.
•	Строка про дедушку (первая) должна соответствовать условию.
•	Строка про бабушку (вторая) должна соответствовать условию.
•	Строка про папу (третья) должна соответствовать условию.
•	Строка про маму (четвертая) должна соответствовать условию.
•	Строка про сына (пятая) должна соответствовать условию.
•	Строка про дочь (шестая) должна соответствовать условию.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat grandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat grandMother = new Cat(grandMotherName);

        String dadName = reader.readLine();
        Cat dad = new Cat(dadName,null,grandFather);

        String momName = reader.readLine();
        Cat mom = new Cat(momName,grandMother,null);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName,mom,dad);

        String daughterName = reader.readLine();
        Cat daughter = new Cat(daughterName,mom,dad);



        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(dad);
        System.out.println(mom);
        System.out.println(son);
        System.out.println(daughter);

    }

    public static class Cat {
        private String name;
        private Cat parentMom;
        private Cat parentFather;

        Cat(String name) {
            this.name = name;
        }

        public Cat(String name, Cat parentMom, Cat parentfather) {
            this.name = name;
            this.parentMom = parentMom;
            this.parentFather = parentfather;
        }

        @Override
        public String toString() {
            if ((parentMom == null)&(parentFather == null)){
                return "The cat's name is " + name + ", no mother , no father ";
            }else if ((parentMom == null)){
                return "The cat's name is " + name + ", no mother, father is " + parentFather.name ;
            }else if ((parentFather == null)){
                return "The cat's name is " + name + ", mother is "+ parentMom.name +", no father";
            }else 
			return "The cat's name is " + name + ", mother is "+ parentMom.name + ", father is " + parentFather.name;
        }
    }	
}