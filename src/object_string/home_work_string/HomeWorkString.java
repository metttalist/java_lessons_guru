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

import exceptions.myexceptions.homework.NullException;

import javax.swing.*;
import java.awt.*;

public class HomeWorkString {
    public static void main(String[] args) throws NullException, NumberException {
        String in_1 = JOptionPane.showInputDialog(null, "Введите текущий день недели");
        try {
            if (in_1.isEmpty()) throw new NullException();
            if (in_1.matches("[0-9]*")) throw new NumberException();
            System.out.println(in_1.toUpperCase());
            System.out.println(in_1.toLowerCase());
            System.out.println(in_1.substring(1, 6));
            if (in_1.indexOf("hello") == -1) {
                System.out.println("Нет вхождений с данной подстрокой");
            } else System.out.println("Есть!");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Вы ввели число, а не строку!3");
        } catch (NullException e) {
            System.out.println(e);
        } catch (NumberException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Не корректыне данные!");
        }
    }
}
