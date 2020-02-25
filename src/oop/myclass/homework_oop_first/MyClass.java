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
    }
}
