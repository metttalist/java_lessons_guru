/*
Попросите пользователя ввести первое число через JOptionPane, а затем аналогично второе.
Попросите пользователя ввести одну из операций: «+», «-», «*», «/».
Используя switch-case выполните соответствующую операцию между двумя введёнными числами и выведите результат через JOptionPane.
Примечание: При вводе некорректных данных выведите информацию об ошибке в консоль и завершите программу.
 */

package switchcase;

import javax.swing.*;

public class HomeWorkSwitchCase {
    public static void main(String[] args) {
        String a;
        a = JOptionPane.showInputDialog(null, "Введите первое положительное число", JOptionPane.INFORMATION_MESSAGE);
        if (a != null && !a.equals("")) {
            int sum_1 = Integer.parseInt(a);
            String b;
            b = JOptionPane.showInputDialog(null, "Введите второе положительное число", JOptionPane.INFORMATION_MESSAGE);
            if (b != null && !b.equals("")) {
                int sum_2 = Integer.parseInt(b);
                String operator;
                operator = JOptionPane.showInputDialog(null, "Введите математическую операцию", JOptionPane.INFORMATION_MESSAGE);
                if (operator != null && !operator.equals("")) {
                    int summa;
                    switch (operator) {
                        case "+":
                            summa = sum_1 + sum_2;
                            JOptionPane.showMessageDialog(null, sum_1 + " + " + sum_2 + " = " + summa);
                            break;
                        case "-":
                            summa = sum_1 - sum_2;
                            JOptionPane.showMessageDialog(null, sum_1 + " - " + sum_2 + " = " + summa);
                            break;
                        case "*":
                            summa = sum_1 * sum_2;
                            JOptionPane.showMessageDialog(null, sum_1 + " * " + sum_2 + " = " + summa);
                            break;
                        case "/":
                            summa = sum_1 / sum_2;
                            JOptionPane.showMessageDialog(null, sum_1 + " / " + sum_2 + " = " + summa);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Неизвестная математическая операция!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Вы не ввели математическую операцию.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Вы не ввели второе число.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Вы не ввели первое число.");
        }
    }
}
