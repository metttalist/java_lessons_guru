package oop.abstractclass.homework;

public class UserSocial extends User {
    private int age;
    private String name;

    public UserSocial(int id, String login, String password, int age, String name) {
        super(id, login, password);
        this.age = age;
        this.name = name;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    public void setAge() {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printUser() {
        System.out.println("Пользователь: " + this.getLogin());
        System.out.println("   Имя: " + this.getName());
        System.out.println("   ID: " + this.getId());
        System.out.println("   Пароль: " + this.getPassword());
        System.out.println("   Возраст: " + this.getAge());
    }
}
