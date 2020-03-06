package oop.recursion;

public class Recursions {

    public static int factorial(int x){
        if (x == 1) return 1;
        return factorial(x - 1) * x;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
