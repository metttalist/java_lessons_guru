package oop.subclass.practice;

public class Main {
    public static void main(String[] args) {

//      Оздание экземпляра класса
        Bicycle gt = new Bicycle("GT", 11);

        Bicycle.SteeringWheel wheel = gt.new SteeringWheel();

//      создание экземпляра вложенного класса седушка. то есть мы создаём экземпляр класса седушка у экземпляра велосипеда.
//      Велосипед.Седушка экземпляр = экземпляр класса велосипед(gt). new Седушка();
        Bicycle.Seat seat = gt.new Seat();

        seat.up();
        gt.start();
        wheel.left();
        wheel.right();
    }
}
