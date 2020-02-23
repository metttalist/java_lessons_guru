/*
Используя бесконечный цикл do-while, заставьте пользователя ввести положительное целое число.
Примечание: Если пользователь вводит что-то некорректное, то сообщайте ему об этоми просите снова ввести положительное целое число.
И так до бесконечности, пока он не введёт правильный вариант.
Как только он вводит правильный вариант, выходите из цикла, и выводите JOptionPane с сообщением: «Спасибо!»
 */

package cycledowhile;

import javax.swing.*;

public class Homework {
    public static void main(String[] args) {
        String in;
        in = JOptionPane.showInputDialog(null, "Введите положительное число", JOptionPane.INFORMATION_MESSAGE);
        int n = Integer.parseInt(in);
        do {
            if (!in.isEmpty()) break;
            // TODO не срабатывает проверка
            if (in == null && in.isEmpty()) continue;
        } while (in != null && !in.equals(""));
        {
            JOptionPane.showMessageDialog(null, "Спасибо");
            System.out.println(n);
        }
    }
}
