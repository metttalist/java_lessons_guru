/*
Создайте класс UserSocial – наследника класса User из предыдущих упражнений.
Добавьте в классе UserSocial поле с именем пользователя и его возрастом, сделав так же методы get и set, а также реализовав конструктор с пятью параметрами
(id, логин, пароль, имя, возраст), в котором присвоить все значения полям, используя так же super().
Создайте класс WebMaster – наследника класса User.
Добавьте поле с адресом сайта, сделав так же методы get и set, плюс конструктор по аналогии со 2-м пунктом.
Создайте объект класса UserSocial и объект класса WebMaster.
Выведите у обоих объектов результат работы методов get и set, доставшиеся
по наследству от User.
Выведите результат работы новых методов get и set у каждого из объектов.
 */

package oop.extend.homework;

import oop.myclass.homework_oop_first.User;

public class UserSocial extends User {
    //Добавьте в классе UserSocial поле с именем пользователя и его возрастом
    private int age;
    private String name;
    // Конструктор
    public UserSocial(int id, String login, String password, int age, String name) {
        super(id, login, password);
        this.age = age;
        this.name = name;
    }
    // так же методы get и set
    int getAge(){
        return age;
    }

    String getName(){
        return name;
    }

    public void setAge(){
        this.age = age;
    }

    public void setName(){
        this.name = name;
    }
}
