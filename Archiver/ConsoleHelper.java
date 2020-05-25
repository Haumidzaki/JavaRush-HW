package com.javarush.task.task31.task3110;

import java.util.Scanner;

public class ConsoleHelper {

    public static void writeMessage(String message){ //вывести сообщение в консоль
        System.out.println(message);
    }

    public static String readString(){ // прочитать строку с консоли
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static int readInt(){ // прочитать число с конслоли
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        try {
            num = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Ввели не число");
            System.out.println("");
            readInt();
        }
        return num;
    }
}
