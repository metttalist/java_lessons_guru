package oop.abstractclass.homework;

import oop.extend.homework.WebMaster;

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

    @Override
    public void printUser() {
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

    public void setName(String name){
        this.name = name;
    }
    static UserSocial u1 = new UserSocial(1, "Dan", "Password", 25, "Дэн");
    static oop.extend.homework.WebMaster u2 = new WebMaster(2, "Ban", "Password",  "www.dan.ru");

}
