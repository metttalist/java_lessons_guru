/*
Сделайте абстрактным класс User из предыдущих упражнений, при этом WebMaster и UserSocial оставьте без изменений на данном этапе.
 Добавьте в класс User абстрактный метод printUser() (public и без возвращаемого значения).
 Убедитесь, что при запуске выдаётся ошибка и требование реализовать абстрактный метод в классах-наследниках.
 Реализуйте printUser() в WebMaster и UserSocial, выведя в этом методе в консоль информацию о пользователе
(в свободном стиле, но обязательно, чтобы все поля объекта были указаны).
 */

package oop.abstractclass.homework;

public class Main extends User {

    private String login;
    private int id;
    private String password;

    public Main(int id, String login, String password) {
        super(id, login, password);
        this.login = login;
        this.id = id;
        this.password = password;
    }

    @Override
    public void printUser() {
//        System.out.println("Пользователь с логин: " + this.login + "; " + "id=" + this.id + "; " + " Пароль: " + this.password);
        System.out.println(this.getLogin());
    }

    static UserSocial u1 = new UserSocial(1, "Dan", "Password", 25, "Дэн");
    static oop.abstractclass.homework.WebMaster u2 = new oop.abstractclass.homework.WebMaster(2, "Ban", "Password",  "www.dan.ru");

    public static void main(String[] args) {
        UserSocial u1 = new UserSocial(1, "Dan", "Password", 25, "Дэн");
        WebMaster u2 = new WebMaster(2, "Ban", "Password",  "www.dan.ru");

        System.out.println(u1.getName());
        u1.setName("Dan");
        System.out.println(u1.getName());

        System.out.println(u2.getWeb_address());
        u2.setWeb_address("www.ban.com");
        System.out.println(u2.getWeb_address());
    }

}
