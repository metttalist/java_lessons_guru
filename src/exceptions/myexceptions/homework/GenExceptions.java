/*
Создайте 2 класса-наследника от Exception: NullException и NoNumberException.
В классе NullException реализуйте метод toString(), в котором верните строку: «Вы ничего не ввели».
В классе NoNumberException реализуйте метод toString(), в котором верните строку: «Вы ввели не число».
Доработайте программу из упражнения к уроку «Генерация исключений», чтобы в зависимости от ошибки выбрасывалось соответствующее исключение.
В блоке catch выведите в JOptionPane сам объект исключения.
 */

package exceptions.myexceptions.homework;

import javax.swing.*;

public class GenExceptions {

    public static void main(String[] args) throws NullException, NoNumberException { // передал управление на верхний уровень
        String in_1 = JOptionPane.showInputDialog(null, "Введите положительное число 1");
        String in_2 = JOptionPane.showInputDialog(null, "Введите положительное число 2");
//      Начало выполнения кода. Если ошибок нет - то выполнится код только из блока try
        try {
            int a = Integer.parseInt(in_1);
            int b = Integer.parseInt(in_2);
            JOptionPane.showMessageDialog(null, "Сумма чисел: " + (a + b));
//          Вызов исключений
            if (in_1.isEmpty() || in_2.isEmpty()) throw new NullException();
            if (!in_1.matches("[0-9]*") || !in_2.matches("[0-9]*")) throw new NoNumberException();
            if (a <= 0 || b <= 0) throw new Exception();
        } catch (NullException e) {
            JOptionPane.showMessageDialog(null, e); // Вывод сообщения, что ничего не введено
        } catch (NoNumberException e) {
            JOptionPane.showMessageDialog(null, e); // Вывод сообщения, что введено не число
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Не корректыне данные!");
        }
//      код который выведется в любом случае
        finally {
            System.out.println("Программа завершается");
        }
    }
}
