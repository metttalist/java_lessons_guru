/*
Используя JOptionPane, попросите пользователя ввести первое положительное число.
Если пользователь не ввёл ничего, то напишите ему об этом, используя JOptionPane.
Используя JOptionPane, попросите пользователя ввести второе число, отличное от 0.
Если пользователь не ввёл ничего, то напишите ему об этом, используя JOptionPane.
Если пользователь ввёл 0, то выведите в JOptionPane сообщение: «Результат: бесконечность».
Если пользователь ввёл не 0, то выведите через JOptionPane результат деления первого числа на второе.
Примечание: Если пользователь ввёл некорректные данные (ничего не ввёл, либо какую-нибудь строку вместо числа), то завершайте программу.
 */

package conditional;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class Homework {
    public static void main(String[] args) {
        // Используя JOptionPane, попросите пользователя ввести первое положительное число.
        String a;
        String b;
        a = JOptionPane.showInputDialog(null, "Введите число", JOptionPane.QUESTION_MESSAGE);
        if (a == null || a.equals("")) {
            JOptionPane.showMessageDialog(null, "Вы ничего не ввели.");
        } else {
            b = JOptionPane.showInputDialog(null, "Введите число отличное от 0", JOptionPane.QUESTION_MESSAGE);
            int n = Integer.parseInt(b);
            if (b == null || b.equals("")) JOptionPane.showMessageDialog(null, "Вы ничего не ввели.");
            else if (n == 0) JOptionPane.showMessageDialog(null, "Результат: бесконечность.");
            else {
                int num1 = Integer.parseInt(a);
                int num2 = Integer.parseInt(b);
                int result = num1 / num2;
                JOptionPane.showMessageDialog(null, result);
            }
        }
    }
}
