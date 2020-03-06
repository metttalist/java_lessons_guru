/*
Попросите пользователя ввести число, используя JOptionPane.
 Если пользователь ввёл число, то выведите в JOptionPane сообщение: «Спасибо!».
 Если пользователь ничего не ввёл, либо ввёл не число, то выбросить исключение, в catch-блоке которого через JOptionPane вывести сообщение:
«Некорректный ввод».
 */

package exceptions.exceptions_finaly.homework;

import javax.swing.*;

public class HomeWorkFinaly {
    public static void main(String[] args) {
        String in = JOptionPane.showInputDialog(null, "Введите число 1");
        try {
            int numb = Integer.parseInt(in);
            JOptionPane.showMessageDialog(null, "Спасибо!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Некорректный ввод!");
        }
    }
}
