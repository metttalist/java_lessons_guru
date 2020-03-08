package exceptions.myexceptions;

import javax.swing.*;

public class MyExceptions {
    public static void main(String[] args) throws UserException {
/*
        String in_1 = JOptionPane.showInputDialog(null, "Введите положительное число 1");
        String in_2 = JOptionPane.showInputDialog(null, "Введите положительное число 2");
//      Попытка выполнения кода
        try {
            int a = Integer.parseInt(in_1);
            int b = Integer.parseInt(in_2);
            if (a <= 0 || b <= 0) throw new NegativeException();
            if (a > 100 || b > 100) throw new HundredException();
            JOptionPane.showMessageDialog(null, "Сумма чисел: " + (a + b));
//      Исключение для ондого случая
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Вы не ввели числа!");
//      Исключение для другого случая
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Числа отрицательные!");
        }
//      код который выведется в любом случае
        catch (HundredException e) {
            JOptionPane.showMessageDialog(null, "Числа больше 100!");
        } finally {
            System.out.println("Программа завершается");
        }
*/


        String in = JOptionPane.showInputDialog(null, "Введите логин");
        User user = new User();
        try { // успешная работа
            user.setLogin(in);
            System.out.println(user.getLogin());
        } catch (UserException ex) { // перехват исключения
            if (ex.getCode() == UserException.SHORT_LOGIN) {
                JOptionPane.showMessageDialog(null, "Логин слишком короткий");
            } else if (ex.getCode() == UserException.LONG_LOGIN) {
                JOptionPane.showMessageDialog(null, "Логин слишком длинный");
            }
        }
    }
}
