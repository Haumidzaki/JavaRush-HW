package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".

Требования:
•	Дата должна содержать день, месяц и год, разделенные пробелом.
•	День должен соответствовать текущему.
•	Месяц должен соответствовать текущему.
•	Год должен соответствовать текущему.
•	Вся дата должна быть выведена в одной строке.
*/

public class Solution {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
        String date = format.format(new Date());
        System.out.println(date);
    }
}
