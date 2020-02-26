package oop.access;

public class Access {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.city); // РАботает поскольку один пакет access
//      System.out.println(p.age); // Ошибка
        System.out.println(p.getAge()); // Обращение к полю через геттер.
    }
}
