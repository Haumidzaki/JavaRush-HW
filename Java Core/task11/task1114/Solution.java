package com.javarush.task.task11.task1114;

/* 
Все мировые религии
Изменить три класса: Judaism (Иудаизм), Christianity (Христианство), Islam (Мусульманство).
Унаследовать христианство от иудаизма и мусульманство от христианства.

Требования:
•	В классе Solution должен быть public класс Judaism (Иудаизм).
•	В классе Solution должен быть public класс Christianity (Христианство).
•	В классе Solution должен быть public класс Islam (Мусульманство).
•	Класс Christianity должен быть унаследован от класса Judaism.
•	Класс Islam должен быть унаследован от класса Christianity.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Judaism {

    }

    public class Christianity extends Judaism {

    }

    public class Islam extends Christianity {

    }

}