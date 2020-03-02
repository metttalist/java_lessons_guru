package oop.interfaces.practice;

public class Main {
    public static void main(String[] args) {
        Mi8 mi8 = new Mi8();
        Boeing737 b737 = new Boeing737();

        Test test = new Test();
        test.foo(mi8);
    }
}
