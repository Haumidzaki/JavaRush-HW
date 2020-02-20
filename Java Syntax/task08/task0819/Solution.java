package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.*;

/* 
Set из котов
1. Внутри класса Solution создать public static класс кот - Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
Каждый кот с новой строки.

Требования:
•	Программа должна выводить текст на экран.
•	Внутри класса Solution должен быть public static класс Cat с конструктором по умолчанию.
•	Метод createCats() класса Solution должен возвращать множество (Set), содержащее 3 кота.
•	Метод printCats() класса Solution должен вывести на экран всех котов из множества. Каждый кот с новой строки.
•	Метод main() должен один раз вызывать метод createCats().
•	Метод main() должен вызывать метод printCats().
•	Метод main() должен удалять одного кота из множества котов.
*/

public class Solution {

     public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> iterator = cats.iterator();
        cats.remove(iterator.next());
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<>();
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());
        return set;
    }

    public static void printCats(Set<Cat> cats) {
           Iterator<Cat>iterator = cats.iterator();

            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
    }

    public static class Cat {

        public Cat() {
        }
    }
}
