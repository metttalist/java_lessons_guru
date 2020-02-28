package oop.abstractclass.homework;

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

    @Override
    public void printUser() {
        System.out.println("Пользователь: " + this.getLogin());
        System.out.println("   ID: " + this.getId());
        System.out.println("   Web - адрес: " + this.getWeb_address());
        System.out.println("   Пароль: " + this.getPassword());
    }
}
