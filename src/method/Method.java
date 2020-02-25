package method;

import myclass_oop_first.Person;

public class Method {
    public static void main(String[] args) {
        Person p = new Person("Иван", "Омск", 20);
        System.out.println(p.get_text_info());
//      применение сеттеров
        p.setName("Васёк");
        p.setCity("Краснодар");
        p.setAge(19);
//      применение геттеров
        System.out.println(p.getName());
        System.out.println(p.getCity());
        System.out.println(p.getAge());

        Person p_new = new Person("Женя", "Иваново", 19);
        p.who_is_older(p_new);
//      применение сеттеров
        p_new.setAge(30);
        p.who_is_older(p_new);
        p_new.setAge(17);
        p.who_is_older(p_new);

        Person person = new Person();
        System.out.println(person.get_text_info());

//      вызов методов(сеттеров) без параметров, то есть будут установлены по умолчанию.
        p_new.setName();
        p_new.setCity();
        p_new.setAge();
        System.out.println(person.get_text_info());
    }
}
