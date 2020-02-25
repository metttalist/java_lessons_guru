package myclass_oop_first;

public class MyClass {
    public static void main(String[] args) {
        Person p = new Person("Dan", "Москва", 27);
        System.out.println(p.name);
        System.out.println(p.city);
        System.out.println(p.age);
//      создание массива персон
        Person[] p_arr = new Person[3];
        p_arr[0] = new Person("Ban", "Almaty", 30);
        p_arr[1] = new Person("John", "Актау", 30);
        p_arr[2] = new Person("Ivan", "Уральск", 30);
//      вывод всех экземплярова класса в цикле for
        for (int i = 0; i < p_arr.length; i++) {
            System.out.println(p_arr[i].name + " " + p_arr[i].city + " " + p_arr[i].age);
        }
//      вывод всех экземплярова класса в цикле each for
        System.out.println();
        for (Person temp : p_arr) {
            temp.age = 15;
            System.out.println(temp.name + " " + temp.city + " " + temp.age);
        }
    }
}
