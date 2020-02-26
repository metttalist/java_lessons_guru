package oop.extend;

import oop.static_data.Person;

public class Extend {
    public static void main(String[] args) {
        Programmer p = new Programmer("Дэн", "", 20, 7);
        System.out.println(p.getTextInfo());

        Worker w = new Worker();
        w.setSalary(2000);
        System.out.println(w.getTextInfo());

        Person p1 = new Programmer("Дэн", "", 20, 7);
        System.out.println(p1.get_text_info());
    }
}
