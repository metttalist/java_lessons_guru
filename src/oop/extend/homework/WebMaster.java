/*
Создайте класс WebMaster – наследника класса User.
Добавьте поле с адресом сайта, сделав так же методы get и set, плюс конструктор по аналогии со 2-м пунктом.
Создайте объект класса UserSocial и объект класса WebMaster.
Выведите у обоих объектов результат работы методов get и set, доставшиеся
по наследству от User.
Выведите результат работы новых методов get и set у каждого из объектов.
 */

package oop.extend.homework;

import oop.myclass.homework_oop_first.User;

public class WebMaster extends User {
    String web_address;

    public WebMaster(int id, String login, String password, String web_address) {
        super(id, login, password);
        this.web_address = web_address;
    }

    public String getWeb_address() {
        return web_address;
    }

    public void setWeb_address(String web_address) {
        this.web_address = web_address;
    }
}
