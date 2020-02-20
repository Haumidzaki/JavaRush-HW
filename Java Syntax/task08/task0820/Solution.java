package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.*;

/* 
Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog без конструктора или с конструктором без параметров.
2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
Каждое животное с новой строки.

Требования:
•	Программа должна выводить текст на экран.
•	Внутри класса Solution должны быть созданы public static классы Cat, Dog.
•	Метод createCats() класса Solution должен возвращать множество (Set) содержащее 4 кота.
•	Метод createDogs() класса Solution должен возвращать множество (Set) содержащее 3 собаки.
•	Метод join() класса Solution должен возвращать объединенное множество всех животных - всех котов и собак.
•	Метод removeCats() должен удалять из множества pets всех котов, которые есть в множестве cats.
•	Метод printPets() должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки.
*/

public class Solution {

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();
        Set<Object> pets = join(cats, dogs);
        printPets(pets);
        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> result1 = new HashSet<Dog>();
        result1.add(new Dog());
        result1.add(new Dog());
        result1.add(new Dog());
        return result1;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> result2  = new HashSet<>();
        Iterator<Cat> iterator = cats.iterator();

        while (iterator.hasNext()){
            result2.add(iterator.next());
        }
        Iterator<Dog>  iterator1= dogs.iterator();

        while (iterator1.hasNext()){
            result2.add(iterator1.next());
        }
        return result2;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        Iterator<Cat>  iterator = cats.iterator();

        while (iterator.hasNext()){
                pets.remove(iterator.next());
        }
    }

    public static void printPets(Set<Object> pets) {
        Iterator<Object> iterator = pets.iterator();

        while (iterator.hasNext()){
            Object p = iterator.next();
            System.out.println(pets);
        }
    }
    public static class Cat {
     
    }

    public static class Dog {
 
    }
}
