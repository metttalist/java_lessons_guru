package oop.subclass;

public class Subclass {
    public static void main(String[] args) {
        Firm firm = new Firm("Рога и копыта", "Василий", 30);
        System.out.println(firm.director.name);
        System.out.println("Директор является пенсионером = " + firm.director.isPensioner());
        firm.director.age = 65;
        System.out.println("Директор является пенсионером = " + firm.director.isPensioner());

    }
}
