/*
Создайте массив целых чисел из 5-ти элементов.
 Используя JOptionPane, попросите указать пользователя индекс элемента, который он хочет посмотреть.
 Если пользователь указывает индекс отрицательный, то сгенерируйте исключение и обработайте его.
 Если пользователь ввёл некорректный индекс, то Java автоматически выбросит исключение, которое Вам так же нужно перехватить и обработать.
 Если пользователь ввёл корректный индекс, то в JOptionPane вывести соответствующий этому индексу элемент массива.
Примечание: В качестве обработки исключения выводите соответствующее сообщение в JOptionPane
 */

package exceptions.multiexceptions.homework;

import javax.swing.*;

public class HomeWorkMultiExceptions {
    public static void main(String[] args) {
        int[] numbs = {27, 84, 77, 987, 11};
        String in_numb = JOptionPane.showInputDialog(null, "Введите индекс массива");
        try {
            int a = Integer.parseInt(in_numb);
            if (a <= 0) throw new Exception();
            else if (a > numbs.length) throw new ArrayIndexOutOfBoundsException();
            System.out.println(numbs[a]);
        } catch (NumberFormatException e) {
            System.out.println("Вы не ввели число!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Не допустимое число!");
        } catch (Exception e) {
            System.out.println("Число должно быть положительным");
        } finally {
            System.out.println("Программа завершается");
        }
    }
}
