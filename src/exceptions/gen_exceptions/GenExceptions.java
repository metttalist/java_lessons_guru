package exceptions.gen_exceptions;

import javax.swing.*;

public class GenExceptions {
    public static void main(String[] args) {
        String in_1 = JOptionPane.showInputDialog(null, "Введите положительное число 1");
        String in_2 = JOptionPane.showInputDialog(null, "Введите положительное число 2");
//      Попытка выполнения кода
        try {
            int a = Integer.parseInt(in_1);
            int b = Integer.parseInt(in_2);
            if (a <= 0 || b <= 0) throw new Exception();
            JOptionPane.showMessageDialog(null, "Сумма чисел: " + (a + b));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Не корректыне данные!");
        }
//      код который выведется в любом случае
        finally {
            System.out.println("Программа завершается");
        }
    }
}
