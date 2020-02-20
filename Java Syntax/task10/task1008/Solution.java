package com.javarush.task.task10.task1008;

/* 
Правильный ответ: d = 2.941
Добавить одну операцию по преобразованию типа, чтобы получался ответ: d = 2.941

Пример вывода:
2.9411764705882355

Требования:
•	Программа должна выводить текст на экран.
•	Нельзя менять команду вывода на экран.
•	Метод main() должен содержать переменную a типа int.
•	Метод main() должен содержать переменную b типа int.
•	Метод main() должен содержать переменную d типа double.
•	Значения переменных менять нельзя. Можно добавлять только операторы приведения типа.
•	Программа должна выводить число 2.9411764705882355.
*/

public class Solution {

    public static void main(String[] args) {
        int a = 50;
        int b = 17;
        double d = (double)a / (double)b;
        System.out.println(d);
    }
}
