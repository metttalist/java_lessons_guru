package oop.static_data;

import oop.static_data.Person;

public class StaticData {
    public static void main(String[] args) {
        new Person();
        System.out.println("Создано обЪектов: " + Person.count);
        new Person();
        System.out.println("Создано обЪектов: " + Person.count);
        new Person();
        System.out.println("Создано обЪектов: " + Person.getCount());
    }
}
