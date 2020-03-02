package oop.interfaces.practice;

public class Mi8 extends Helocipter implements VerticalTakeoff {
    @Override
    public void fly() {
        System.out.println("Вертушка Ми-8");
    }

    @Override
    public void vertical_takeoff() {
        System.out.println("Вертушка Ми-8 вертикально взлетает");
    }
}
