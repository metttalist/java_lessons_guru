/*
№ 1
Создайте класс User со следующими полями, подобрав правильный тип данных: id, логин, пароль.
Создайте конструктор класса User, приняв все 3 параметра для полей.
Присвойте полям полученные параметры.
Создайте два объекта класса User с различными входными параметрами.
Выведите в консоль все поля обоих объектов в следующем виде (можно с использованием массива и цикла): «id=5; логин=admin; password=abc»
Примечание: id – это уникальный идентификатор. Он всегда является только целым положительным числом.
 */

/*
№ 2
Используя класс User из предыдущего упражнения, добавьте в нём методы get и set для всех полей.
Добавьте ещё один метод set для каждого поля (сделав, по сути, перегрузку методов),но уже без параметра.
Внутри метода должно присваиваться значение по умолчанию (id = 0; login=”guest”; password=””).
Создайте объект класса User.
Воспользуйтесь методами set и get для установки новых значения для каждого поля и получения результат.
 */

/*
Сделайте все поля в классе User private.
Убедитесь, что доступа из основного класса к этим полям теперь нет (должна быть ошибка при попытке запустить программу).
Используйте метод set для установки нового логина у объекта User.
Используйте метод get для получения нового логина.
 */

package oop.myclass.homework_oop_first;

public class User {
    //  Создайте класс User со следующими полями: id, логин, пароль.
//    Сделайте все поля в классе User private.
    private int id;
    private String login;
    private String password;

    public User(int id, String login, String password) {
//      Присвойте полям полученные параметры.
        this.id = id;
        this.login = login;
        this.password = password;
    }

//  Используя класс User, добавьте в нём методы get и set для всех полей.
    public int getId() {
        return id;
    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
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
    public void setId(){
        setId(0);
    }

    public void setLogin(){
        setLogin("guest");
    }

    public void setPassword(){
        this.password = "";
    }

    public String get_info(){ return "Пользователь с логин: " + this.login + "; " + "id=" + this.id + "; " + " Пароль: " + this.password;}
}
