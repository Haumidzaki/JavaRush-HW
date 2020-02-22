package com.javarush.task.task16.task1632;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. Нить 1 должна бесконечно выполняться;
1.2. Нить 2 должна выводить "InterruptedException" 
при возникновении исключения InterruptedException;
1.3. Нить 3 должна каждые полсекунды выводить "Ура";
1.4. Нить 4 должна реализовать интерфейс Message, при
вызове метода showWarning нить должна останавливаться;
1.5. Нить 5 должна читать с консоли числа пока не введено 
слово "N", а потом вывести в консоль сумму введенных чисел.
2. В статическом блоке добавь свои нити в List<Thread> threads
в перечисленном порядке.
3. Нити не должны стартовать автоматически.

Подсказка:
Нить 4 можно проверить методом isAlive()

Требования:
•	Статический блок класса Solution должен создавать и 
добавлять 5 нитей в список threads.
•	Нити из списка threads не должны стартовать автоматически.
•	Нить 1 из списка threads должна бесконечно выполняться.
•	Нить 2 из списка threads должна выводить "InterruptedException"
при возникновении исключения InterruptedException.
•	Нить 3 из списка threads должна каждые полсекунды выводить "Ура".
•	Нить 4 из списка threads должна реализовать интерфейс Message, 
при вызове метода showWarning нить должна останавливаться.
•	Нить 5 из списка threads должна читать с консоли числа пока не 
введено слово "N", а потом вывести в консоль сумму введенных чисел.
 */

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new First());
        threads.add(new Two());
        threads.add(new Three());
        threads.add(new Four());
        threads.add(new Five());
    }

    public static void main(String[] args) {
        for (Thread thread : threads){
            thread.start();
            try {
                Thread.sleep(500);
                if(thread instanceof Four){
                    ((Four) thread).showWarning();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static class First extends Thread implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static class Two extends Thread implements Runnable {

        @Override
        public void run() {
            try{
                while (true){
                    Thread.sleep(20);
                }
            }catch(InterruptedException e){
                System.out.println("InterruptedException");
            }
        }
    }
    public static class Three extends Thread implements Runnable {

        @Override
        public void run() {
           while (true){
               try {
                   System.out.println("Ура");
                   sleep(500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        }
    }
    public static class Four extends Thread implements Runnable, Message {
        @Override
        public void showWarning() {
            this.interrupt();
        }

        @Override
        public void run() {
           while (!interrupted()){

           }
        }
    }
    public static class Five extends Thread implements Runnable {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();
        int sum = 0;

        @Override
        public void run() {
            while (true){
                String number = scanner.nextLine();
                if(number.equalsIgnoreCase("N")){
                    break;
                }
                numbers.add(number);
            }
            for (String n : numbers){
                sum = sum + Integer.parseInt(n);
            }
            System.out.println(sum);
        }
    }
}