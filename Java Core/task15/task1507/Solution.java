package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.

Требования:
•	В классе Solution должны быть реализованы 10 методов printMatrix с различными аргументами.
•	Класс Solution должен быть public.
•	Все методы класса Solution должны быть статическими.
•	Все методы класса Solution должны быть публичными.
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;

public class Solution {
    public static void main(String[] args) {
        printMatrix((int) 2, (int) 3, (Object) "8");
        printMatrix((Integer) 3, (int) 4, (String) "8");
        printMatrix((byte) 1, (byte) 1, (String) "9");
        printMatrix((short) 4, (short) 2, (String) "1");
        printMatrix((long) 4, (long) 4, (Object) "2");
        printMatrix((float) 3, (float) 3, (Object) "3");
        printMatrix((double) 5, (double) 5, (Object) "5");
        printMatrix((char) 6, (char) 6, (Object) "6");
        printMatrix((byte) 7, (byte) 7, (Object) "7");
        printMatrix((short) 8, (short) 8, (Object) "3");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix((int) m, (int) n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(Integer m, int n, String value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(byte m, byte n, String value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(short m, short n, String value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(long m, long n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(float m, float n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(double m, double n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(char m, char n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(byte m, byte n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}