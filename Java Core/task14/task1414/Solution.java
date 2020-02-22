package com.javarush.task.task14.task1414;
import java.util.Scanner;
/* 
MovieFactory
Расширение функционала по аналогии, чтение с консоли:
1. Разобраться, что программа умеет делать.
2. Все классы должны быть внутри класса Solution.
3. Добавить классы Cartoon, Thriller.
4. Разобраться, как мы получаем объект класса SoapOpera по ключу "soapOpera".

Аналогично получению объекта SoapOpera сделать:
5. Добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
6. Добавить в MovieFactory.getMovie получение объекта Thriller для ключа "thriller".
7. Считать с консоли несколько ключей (строк).
7.1. Ввод заканчивается, как только вводится строка не совпадающая 
с одной из: "cartoon", "thriller", "soapOpera".
8. Создать переменную movie типа Movie и для каждой введенной строки(ключа):
8.1. Получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
8.2. Вывести на экран movie.getClass().getSimpleName().

Требования:
•	Классы Cartoon и Thriller должны быть статическими и существовать 
внутри класса Solution.
•	Метод MovieFactory.getMovie должен возвращать объект типа Cartoon 
в случае передачи ему строки "cartoon" в качестве параметра.
•	Метод MovieFactory.getMovie должен возвращать объект типа Thriller
в случае передачи ему строки "thriller" в качестве параметра.
•	Метод main должен считывать строки с клавиатуры.
•	Метод main должен прекращать считывать строки с клавиатуры в случае, 
если была введена некорректная строка(не "cartoon", не "thriller" или не "soapOpera").
•	Для каждой введенной строки (в том числе для некорректной) необходимо 
вызвать метод MovieFactory.getMovie.
•	Для всех введенных корректных строк необходимо вывести на экран 
простые имена(movie.getClass().getSimpleName()) типов объектов возвращаемых
методом MovieFactory.getMovie.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String text = scanner.nextLine();
            if ((text.contains("cartoon"))|(text.contains("thriller"))|(text.contains("soapOpera"))){
                Movie movie = MovieFactory.getMovie(text);
                System.out.println(movie.getClass().getSimpleName());
            }else
            {
                MovieFactory.getMovie(text);
                break;
            }
        }

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }else if ("thriller".equals(key)){
                movie = new Thriller();
            }else if ("cartoon".equals(key)){
                movie = new Cartoon();
            }
            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }
    static class Cartoon extends Movie {
    }
    static class Thriller extends Movie {
    }
}