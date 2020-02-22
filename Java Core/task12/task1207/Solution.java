package com.javarush.task.task12.task1207;

/* 
Int и Integer
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.

Требования:
•	Класс Solution должен содержать статический метод main().
•	Класс Solution должен содержать статический void метод print() с параметром типа int.
•	Класс Solution должен содержать статический void метод print() с параметром типа Integer.
•	Метод main() должен вызывать метод print() с параметром типа int.
•	Метод main() должен вызывать метод print() с параметром типа Integer.
*/

public class Solution {
    public static void main(String[] args) {
     int a = 2;
     Integer b = 3;
     print(a);
     print(b);
       
    }

    static void print(int a){
        System.out.println(a);
    }
    static void print (Integer b){
        System.out.println(b);
    }
}