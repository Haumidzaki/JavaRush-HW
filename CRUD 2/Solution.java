package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    ArrayList<String> list = new ArrayList<>();
                    for (int i = 1; i < args.length; i++) {
                        list.add(args[i]);
                    }
                    for (int i = 0; i < list.size(); i += 3) {
                        String name = list.get(i);
                        String sex = list.get(i + 1);
                        String bd = list.get(i + 2);
                        String[] date = bd.split("/");
                        if (sex.equals("м")) {
                            allPeople.add(Person.createMale(name, new Date(Integer.parseInt(date[2]) - 1900, Integer.parseInt(date[1]) - 1, Integer.parseInt(date[0]))));
                            System.out.println(allPeople.size() - 1);
                        } else {
                            allPeople.add(Person.createFemale(name, new Date(Integer.parseInt(date[2]) - 1900, Integer.parseInt(date[1]) - 1, Integer.parseInt(date[0]))));
                            System.out.println(allPeople.size() - 1);
                        }
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    ArrayList<String> list = new ArrayList<>();
                    for (int i = 1; i < args.length; i++) {
                        list.add(args[i]);
                    }
                    for (int i = 0; i < list.size(); i += 4) {
                        int id = Integer.parseInt(list.get(i));
                        String name = list.get(i + 1);
                        String sex = list.get(i + 2);
                        String bd = list.get(i + 3);
                        String[] date = bd.split("/");
                        if (sex.equals("м")) {
                            Person person = allPeople.get(id);
                            person.setName(name);
                            person.setSex(Sex.MALE);
                            person.setBirthDate(new Date(Integer.parseInt(date[2]) - 1900, Integer.parseInt(date[1]) - 1, Integer.parseInt(date[0])));
                            allPeople.set(id, person);
                        } else {
                            Person person = allPeople.get(id);
                            person.setName(name);
                            person.setSex(Sex.FEMALE);
                            person.setBirthDate(new Date(Integer.parseInt(date[2]) - 1900, Integer.parseInt(date[1]) - 1, Integer.parseInt(date[0])));
                            allPeople.set(id, person);
                        }
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    ArrayList<String> list = new ArrayList<>();
                    for (int i = 1; i < args.length; i++) {
                        list.add(args[i]);
                    }
                    for (int i = 0; i < list.size(); i++) {
                        int id = Integer.parseInt(list.get(i));
                        Person person = allPeople.get(id);
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                        allPeople.set(id, person);
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    ArrayList<String> list = new ArrayList<>();
                    for (int i = 1; i < args.length; i++) {
                        list.add(args[i]);
                    }
                    for (int i = 0; i < list.size(); i++) {
                        Person person = allPeople.get(Integer.parseInt(list.get(i)));
                        String name = person.getName();
                        Sex sex = person.getSex();
                        Date date = person.getBirthDate();
                        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        String db = format.format(date);
                        if (sex.equals(Sex.MALE)) {
                            String sexPerson = "м";
                            System.out.println(name + " " + sexPerson + " " + db);
                        } else {
                            String sexPerson = "ж";
                            System.out.println(name + " " + sexPerson + " " + db);
                        }
                    }
                }
                break;
        }
    }
}
