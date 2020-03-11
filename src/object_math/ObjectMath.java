package object_math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ObjectMath {
    public static void main(String[] args) {
//      Встроенные константы
        System.out.println(Math.E);
        System.out.println(Math.PI);
//      Методы
        System.out.println(Math.abs(2)); // Делает из отрицательного числа положительное
        System.out.println(Math.cos(45));
        System.out.println(Math.max(20, 45)); // Возвращает максимальное число
        System.out.println(Math.min(20, 45)); // Возвращает миниимальное число
        System.out.println(Math.pow(2, 3)); // Возводит первое (переданное в скобках число) в степень второго (переданное в скобках число). Возвращает тип double.
        System.out.println(Math.round(2.3)); // Стандартное Округление
        System.out.println(Math.ceil(2.3)); // Стандартное Округление до ближайш верхнего целого. Возвращает тип double.
        System.out.println(Math.floor(2.3)); // Стандартное Округление до ближайш нижнего целого. Возвращает тип double.


//      Округление с нужным кол-вом знаков после запятой
        BigDecimal bd = new BigDecimal(5.878380);
        System.out.println(bd.setScale(3, RoundingMode.HALF_UP)); // В скобках указывается кол-во знаков после запятой и правило.
        System.out.println((new BigDecimal(5.878380)).setScale(3, RoundingMode.HALF_UP)); // Тоже что и пример выше


        System.out.println(Math.random()); // Возвращает случайное число от 0 до 1
//      Генерация случайного числа от 1 -100
        int i = (int) (1 + Math.random() * 11); // Генерация случайного числа. Первый парметр = возвращаемый тип, в скобках(int) приведение к желаемому типу данных.
        System.out.println(i);
    }
}
