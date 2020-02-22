/*
Создайте 2 переменных типа double с произвольными значениями.
Выведите в консоль следующие операции сравнения между ними: >, <, >=, <=, !=, ==
 */
package Compare;

public class Homework {
    public static void main(String[] args) {
//        Создайте 2 переменных типа double с произвольными значениями.
        double a = 5.0;
        double b = 11.0;
//        Выведите в консоль следующие операции сравнения между ними: >, <, >=, <=, !=, ==
        System.out.println(a + " < " + b + " = " + (a < b));
        System.out.println(a + " > " + b + " = " + (a > b));
        System.out.println(a + " <= " + b + " = " + (a <= b));
        System.out.println(a + " >= " + b + " = " + (a >= b));
        System.out.println(a + " == " + b + " = " + (a == b));
        System.out.println(a + " != " + b + " = " + (a != b));
    }
}
