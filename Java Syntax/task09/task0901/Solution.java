package com.javarush.task.task09.task0901;

/* 
Возвращаем StackTrace
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать свой StackTrace.

Требования:
•	В классе должно быть 5 методов (метод main не учитывать).
•	Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
•	Каждый метод должен возвращать свой StackTrace.
•	Для получения StackTrace воспользуйся Thread.currentThread().getStackTrace().
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements;
    }

    public static StackTraceElement[] method2() {
        method3();
        StackTraceElement[] stackTraceElements1 = Thread.currentThread().getStackTrace();
        return  stackTraceElements1;
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[] stackTraceElements2 = Thread.currentThread().getStackTrace();
        return  stackTraceElements2;
    }

    public static StackTraceElement[] method4() {
        method5();
        StackTraceElement[] stackTraceElements3 = Thread.currentThread().getStackTrace();
        return  stackTraceElements3;
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] stackTraceElements4 = Thread.currentThread().getStackTrace();
        return  stackTraceElements4;
    }
}