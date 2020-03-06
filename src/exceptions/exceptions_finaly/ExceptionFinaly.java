package exceptions.exceptions_finaly;

import javax.swing.*;

public class ExceptionFinaly {
    public static void main(String[] args) {
        String in_1 = JOptionPane.showInputDialog(null, "Введите число 1");
        String in_2 = JOptionPane.showInputDialog(null, "Введите число 2");
//      Попытка выполнения кода
        try {
            int a = Integer.parseInt(in_1);
            int b = Integer.parseInt(in_2);
            JOptionPane.showMessageDialog(null, "Сумма чисел: " + (a + b));
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Вы не ввели число!");
        }
//      код который выведется в любом случае
        finally {
            System.out.println("Программа завершается");
        }
    }
}
