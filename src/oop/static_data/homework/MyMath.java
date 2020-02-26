/*
Создайте класс MyMath.
Создайте 4 статических метода в нём, которые будут возвращать соответствующие значения: add (сложение), sub (вычитание), mult (умножение) и div (деления).
Проверьте все 4 метода, выводя результат их работы в консоль.
Добавьте статическое private-поле в класс MyMath, в котором будет храниться количество вызовов статических методов.
Инкрементируйте статическое поле при каждом вызове метода.
Создайте статический метод get для этого счётчика.
Выведите в основной программе значение этого счётчика до вызова статических методов и после.
 */

package oop.static_data.homework;

public class MyMath {

    private static int a = 10;
    private static int b = 2;

    //  Добавьте статическое private-поле в класс MyMath, в котором будет храниться количество вызовов статических методов.
    private static int calls = 0;

    private static void setCalls() {
        MyMath.calls++;
    }

    //  Создайте 4 статических метода, которые будут возвращать соответствующие значения: add (сложение), sub (вычитание), mult (умножение) и div (деления).
    static int add() {
        calls++;
        return a + b;
    }

    static int sub() {
        setCalls();
        return a - b;
    }

    static int mult() {
        calls++;
        return a * b;
    }

    static int div() {
        calls++;
        return a / b;
    }

    static int getCalls(){
        return calls;
    }

}
