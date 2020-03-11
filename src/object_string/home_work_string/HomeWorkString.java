/*
Попросите пользователя ввести строку.
 Выведите в консоли следующие данные:
строку от пользователя в верхнем регистре, в нижнем регистре,
подстроку от 2-го символа до 5-го включительно
(2-й символ по счёту, а индекс у него будет 1, что надо учесть),
результат поиска вхождения в строке строки «hello».
Примечание: Обработайте все исключительные ситуации с использованием trycatch.
 */

package object_string.home_work_string;

import javax.swing.*;

public class HomeWorkString {
    public static void main(String[] args) throws NullException, NumberExceptions, TooShortException, TooLongException {
        String in_1 = JOptionPane.showInputDialog(null, "Введите текущий день недели");
        try {
            if (in_1.isEmpty()) throw new NumberExceptions(NumberExceptions.NULL_EXCEPTION);
            if (in_1.matches("[0-9]*")) throw new NumberExceptions(NumberExceptions.NOT_STRING);
            if (in_1.length() < 3) throw new NumberExceptions(NumberExceptions.TOO_SHORT);
            if (in_1.length() > 15) throw new NumberExceptions(NumberExceptions.TOO_LONG);
            System.out.println(in_1.toUpperCase());
            System.out.println(in_1.toLowerCase());
            System.out.println(in_1.substring(2, 6));
            if (in_1.indexOf("hello") == -1) {
                System.out.println("Нет вхождений с данной подстрокой");
            } else System.out.println("Есть!");
        } catch (NumberExceptions e) {
//            if (e.getCode() == NumberExceptions.NULL_EXCEPTION)
//                JOptionPane.showMessageDialog(null, NullException);
//            else if (e.getCode() == NumberExceptions.NOT_STRING)
//                JOptionPane.showMessageDialog(null, NotStringException);
//            else if (e.getCode() == NumberExceptions.TOO_SHORT)
//                JOptionPane.showMessageDialog(null, TooShortException);
//            else if (e.getCode() == NumberExceptions.TOO_LONG)
//                JOptionPane.showMessageDialog(null, TooLongException);
//            else throw new Exception(e);
        }
    }
}
