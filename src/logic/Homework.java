/*
Создайте 3 переменных типа Boolean: true, false, false.
2) Сделайте логические выражения из 3-х переменных, чтобы:
 А) Обязательно был && и в результате было true (решение в качестве примера:
«true && !(false && false)» – только переменные подставляйте, а не значения).
 Б) Обязательно был || и в результате было false.
 В) Обязательно был ^ и в результате было true.
 */

package logic;

public class Homework {
    public static void main(String[] args) {
//        Создайте 3 переменных типа Boolean: true, false, false.
        boolean a = true;
        boolean b = false;
        boolean c = false;
// 2) Сделайте логические выражения из 3-х переменных, чтобы:
// А) Обязательно был && и в результате было true (решение в качестве примера: «true && !(false && false)» – только переменные подставляйте, а не значения).
        System.out.println(a && !(b && c));
// Б) Обязательно был || и в результате было false.
        System.out.println(c || b);
// В) Обязательно был ^ и в результате было true.
        System.out.println(a ^ b);
    }
}
