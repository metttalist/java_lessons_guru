package oop.interfaces;

public class Interfaces {

    public static void main(String[] args) {
        // TODO code application logic here
        Circle c = new Circle(10, 20, 15);
        c.draw();
        Point point = new Point(5, 7);
        point.draw();
        c.hello();
        point.hello();
    }
}


