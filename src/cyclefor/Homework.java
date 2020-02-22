/*
Попросите пользователя ввести положительное целое число через JOptionPane.
Обработайте некорректные данные (ничего не ввёл, отрицательное число, 0, не целое число), выведя соответствующие уведомления об ошибке.
Вычислите сумму всех чисел от 1 до числа, введённого пользователем, используя цикл for.
Выведите результат пользователю через JOptionPane.
Пример: Пользователь ввёл 7, значит, надо вычислить сумму: 1+2+3+4+5+6+7=?
 */

package cyclefor;

import com.sun.xml.internal.bind.v2.TODO;

import javax.swing.*;

public class Homework {
    public static void main(String[] args) {
// Попросите пользователя ввести положительное целое число через JOptionPane.
        String n;
        n = JOptionPane.showInputDialog(null, "Введите число", JOptionPane.INFORMATION_MESSAGE);
        int numb = Integer.parseInt(n);
        int sum = 0;
// Обработайте некорректные данные (ничего не ввёл, отрицательное число, 0, не целое число), выведя соответствующие уведомления об ошибке.
//        TODO Данная проверка не работает, выяснить почему
        if (n == null || n.equals("")) {
            JOptionPane.showMessageDialog(null, "Вы ничего не ввели.");
        }
        else if (numb == 0) {
            JOptionPane.showMessageDialog(null, "Вы ввели 0.");
        }
        else if (numb < 0) {
            JOptionPane.showMessageDialog(null, "Вы ввели отрицательное число");
        }
        else {
            for (int i = 1; i <= numb; i++) {
                sum += i;
            }
            JOptionPane.showMessageDialog(null, "Сумма чисел от 1 до " + n + " = " + sum);
        }
    }
}
