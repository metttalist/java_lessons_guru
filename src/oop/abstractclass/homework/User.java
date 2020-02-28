package oop.abstractclass.homework;

import oop.interfaces.homework.PrintData;

// Сделайте абстрактным класс User.
public abstract class User {
    private int id;
    private String login;
    private String password;

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*
    Добавьте ещё один метод set для каждого поля (сделав, по сути, перегрузку методов),но уже без параметра.
    Внутри метода должно присваиваться значение по умолчанию (id = 0; login=”guest”; password=””).
     */
    public void setId() {
        setId(0);
    }

    public void setLogin() {
        setLogin("guest");
    }

    public void setPassword() {
        this.password = "";
    }

    public String get_info() {
        return "Пользователь с логин: " + this.login + "; " + "id=" + this.id + "; " + " Пароль: " + this.password;
    }

//  Добавьте в класс User абстрактный метод printUser() (public и без возвращаемого значения).
    public abstract void printUser();
}
