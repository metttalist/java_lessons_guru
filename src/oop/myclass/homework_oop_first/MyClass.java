package oop.myclass.homework_oop_first;

public class MyClass {
    public static void main(String[] args) {
//      Создайте два объекта класса User с различными входными параметрами.
        User[] arr_user = new User[2];
        arr_user[0] = new User(123, "Dan", "Dan1");
        arr_user[1] = new User(321, "Ban", "Dan2");

//      Выведите в консоль все поля обоих объектов в следующем виде (можно с использованием массива и цикла): «id=5; логин=admin; password=abc»
        for (User temp : arr_user){
            System.out.println("id=" + temp.id + "; " + "логин=" + temp.login + "; " + "password=" + temp.password);
        }

//      Создайте объект класса User.
        User dan = new User(1, "Dan", "Dan login");
        System.out.println(dan.get_info());

//      Воспользуйтесь методами set и get для установки новых значения для каждого поля и получения результат.
        dan.setId(2);
        dan.setLogin("Дэн");
        dan.setPassword("789");
        System.out.println(dan.getId());
        System.out.println(dan.getLogin());
        System.out.println(dan.getPassword());

    }
}
