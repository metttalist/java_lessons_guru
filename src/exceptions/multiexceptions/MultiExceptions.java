package exceptions.multiexceptions;

import javax.swing.*;

public class MultiExceptions {
    public static void main(String[] args) {
        String in_1 = JOptionPane.showInputDialog(null, "Введите положительное число 1");
        String in_2 = JOptionPane.showInputDialog(null, "Введите положительное число 2");
//      Попытка выполнения кода
        try {
            int a = Integer.parseInt(in_1);
            int b = Integer.parseInt(in_2);
            if (a <= 0 || b <= 0) throw new Exception();
            JOptionPane.showMessageDialog(null, "Сумма чисел: " + (a + b));
//      Исключение для ондого случая
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Вы не ввели числа!");
//      Исключение для другого случая
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Числа отрицательные!");
        }
//      код который выведется в любом случае
        finally {
            System.out.println("Программа завершается");
        }
    }
}
