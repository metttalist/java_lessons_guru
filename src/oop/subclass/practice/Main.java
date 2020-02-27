package oop.subclass.practice;

public class Main {
    public static void main(String[] args) {

//      Оздание экземпляра класса
        Bicycle gt = new Bicycle("GT", 11);

//      создание экземпляра вложенного класса руль. то есть мы создаём переменную руль у переменной велосипед
        Bicycle.SteeringWheel wheel = gt.new SteeringWheel();

//      создание экземпляра вложенного класса седушка. то есть мы создаём переменную седушка у переменной велосипед
        Bicycle.Seat seat = gt.new Seat();

        seat.up();
        gt.start();
        wheel.left();
        wheel.right();
    }
}
