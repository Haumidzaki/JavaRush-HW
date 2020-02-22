package com.javarush.task.task14.task1420;

import java.math.BigInteger;
import java.util.Scanner;
/* 
НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.

Требования:
•	Программа должна считывать с клавиатуры 2 строки.
•	В случае если введенные строки невозможно преобразовать 
в положительные целые числа, должно возникать исключение.
•	Программа должна выводить данные на экран.
•	Программа должна выводить на экран наибольший общий 
делитель(НОД) чисел считанных с клавиатуры и успешно завершаться.
*/

public class Solution {
    public static int gcd (int x, int y){
        BigInteger a = BigInteger.valueOf(x);
        BigInteger b = BigInteger.valueOf(y);
        BigInteger res = a.gcd(b);
        return res.intValue();
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x <= 0 || y <= 0) throw new Exception("Введите положительное число");
            int res = gcd(x,y);
            System.out.println(res);
    }
}
