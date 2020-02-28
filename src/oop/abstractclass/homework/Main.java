/*
Сделайте абстрактным класс User из предыдущих упражнений, при этом WebMaster и UserSocial оставьте без изменений на данном этапе.
 Добавьте в класс User абстрактный метод printUser() (public и без возвращаемого значения).
 Убедитесь, что при запуске выдаётся ошибка и требование реализовать абстрактный метод в классах-наследниках.
 Реализуйте printUser() в WebMaster и UserSocial, выведя в этом методе в консоль информацию о пользователе
(в свободном стиле, но обязательно, чтобы все поля объекта были указаны).
 */

package oop.abstractclass.homework;

public class Main extends User {

    String web_address;


    public Main(int id, String login, String password, String web_address) {
        super(id, login, password);
        this.web_address = web_address;
    }

    @Override
    public void printUser() {

    }

    public static void main(String[] args) {
        UserSocial u1 = new UserSocial(1, "Dan", "Password", 25, "Дэн");
        WebMaster u2 = new WebMaster(2, "Ban", "Password", "www.dan.ru");

        System.out.println(u1.getName());
        u1.setName("Dan");
        System.out.println(u1.getName());

        System.out.println(u2.getWeb_address());
        u2.setWeb_address("www.ban.com");
        System.out.println(u2.getWeb_address());

        u1.printUser();
        u2.printUser();
    }
}
