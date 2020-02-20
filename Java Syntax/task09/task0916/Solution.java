package com.javarush.task.task09.task0916;

import java.io.IOException;
import java.rmi.RemoteException;

/* 
Перехват checked-исключений
В методе handleExceptions обработайте все checked исключения.
Нужно вывести на экран возникшее checked исключение.
Можно использовать только один блок try..catch

Требования:
•	Метод handleExceptions должен вызывать метод method1.
•	Метод handleExceptions должен вызывать метод method2.
•	Метод handleExceptions должен вызывать метод method3.
•	Метод handleExceptions должен использовать только один блок try..catch.
•	Метод handleExceptions должен отлавливать и выводить на экран все возникающие checked исключения.
•	Программа должна выводить на экран текст.
*/

public class Solution {
    public static void main(String[] args) {
        handleExceptions(new Solution());
    }

    public static void handleExceptions(Solution obj) {
        try{
        obj.method1();
        obj.method2();
        obj.method3();
        }
        catch(IOException e){
            System.out.println("IOException");
            System.out.println("RemoteException");
        }
        catch(NoSuchFieldException e){
            System.out.println("NoSuchFieldException");
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}