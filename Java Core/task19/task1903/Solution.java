package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
Адаптируй IncomeData к Customer и Contact.
Классом-адаптером является IncomeDataAdapter.
Инициализируйте countries перед началом выполнения программы. 
Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
Дополнить телефонный номер нулями до 10 цифр при необходимости (смотри примеры).
Обратите внимание на формат вывода фамилии и имени человека.

Требования:
•	Класс Solution должен содержать public static поле countries типа
Map<String, String>.
•	В статическом блоке класса Solution инициализируй поле countries 
тестовыми данными согласно заданию.
•	Класс IncomeDataAdapter должен реализовывать интерфейсы Customer и Contact.
•	Класс IncomeDataAdapter должен содержать приватное поле data типа IncomeData.
•	Класс IncomeDataAdapter должен содержать конструктор с параметром IncomeData.
•	В классе IncomeDataAdapter реализуй методы интерфейсов Customer и
Contact используя подсказки в виде комментариев в интерфейсах.
*/

import java.text.Format;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA","Ukraine");
        countries.put("RU","Russia");
        countries.put("CA","Canada");
    }

    public static void main(String[] args) {
        String text1 = String.valueOf(35);
        String text2 = String.valueOf(240380);
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder.append("+");
        stringBuilder.append(text1);
        for(int i = 0; i < 10 - text2.length(); i++){
            stringBuilder1.append("0");
        }
        stringBuilder1.append(text2);
        String formatText = stringBuilder1.toString();
        stringBuilder.append("(");
        stringBuilder.append(formatText.charAt(0));
        stringBuilder.append(formatText.charAt(1));
        stringBuilder.append(formatText.charAt(2));
        stringBuilder.append(")");
        stringBuilder.append(formatText.charAt(3));
        stringBuilder.append(formatText.charAt(4));
        stringBuilder.append(formatText.charAt(5));
        stringBuilder.append("-");
        stringBuilder.append(formatText.charAt(6));
        stringBuilder.append(formatText.charAt(7));
        stringBuilder.append("-");
        stringBuilder.append(formatText.charAt(8));
        stringBuilder.append(formatText.charAt(9));
        System.out.println(stringBuilder.toString());
    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String text1 = String.valueOf(data.getCountryPhoneCode());
            String text2 = String.valueOf(data.getPhoneNumber());
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder.append("+");
            stringBuilder.append(text1);
            for(int i = 0; i < 10 - text2.length(); i++){
                stringBuilder1.append("0");
            }
            stringBuilder1.append(text2);
            String formatText = stringBuilder1.toString();
            stringBuilder.append("(");
            stringBuilder.append(formatText.charAt(0));
            stringBuilder.append(formatText.charAt(1));
            stringBuilder.append(formatText.charAt(2));
            stringBuilder.append(")");
            stringBuilder.append(formatText.charAt(3));
            stringBuilder.append(formatText.charAt(4));
            stringBuilder.append(formatText.charAt(5));
            stringBuilder.append("-");
            stringBuilder.append(formatText.charAt(6));
            stringBuilder.append(formatText.charAt(7));
            stringBuilder.append("-");
            stringBuilder.append(formatText.charAt(8));
            stringBuilder.append(formatText.charAt(9));
            return stringBuilder.toString();
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}