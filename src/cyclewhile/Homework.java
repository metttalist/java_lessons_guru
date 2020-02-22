/*
Попросите пользователя ввести неотрицательно целое число через JOptionPane.
Обработайте некорректные данные (ничего не ввёл, отрицательное число, не целое число), выведя соответствующие уведомления об ошибке.
Вычислите факториал числа, введённого пользователем, используя цикл while.
Выведите результат пользователю через JOptionPane.
Примечание: Факториал 0 = 1, факторил 1 = 1, факториал 2 = 1 * 2, факториал 3 = 1 * 2 *3, факториал числа n = 1 * 2 * 3 * … * (n – 1) * n.

 */

package cyclewhile;

import javax.swing.*;

public class Homework {
    public static void main(String[] args) {
        int i = 0;
        String in = JOptionPane.showInputDialog(null, "Введите положительное число", JOptionPane.QUESTION_MESSAGE);
        if (in != null && !in.equals("")) {
            double n = Double.parseDouble(in);
            if (n < 0) {
                System.out.println("Вы ввели отрицательное число");
            } else if (n == 0) {
                System.out.println("Вы ввели 0");
            } else {
                int sum = 1;
                i = 1;
                while (i <= n) {
                    sum *= i;
                    i++;
                }
                System.out.println(sum);
            }
        } else {
            System.out.println("Вы не ввели число");
        }
    }
}
