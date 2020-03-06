/*
Создайте массив целых чисел из 5 элементов.
 Обратитесь к элементу с индексом 5.
 Посмотрите, что за исключение выскакивает при работе программы.
 Перехватите его с помощью try-catch и выведите в блоке catch в консоль уведомление об ошибке.
 Запустите программу и проанализируйте отличия.
 */

package exceptions.homework;

public class MainHomeWork {
    public static void main(String[] args) {
//      Создайте массив целых чисел из 5 элементов.
        int[] arr = {23, 11, 75, 89, 24};
//      с  помощью try-catch выведите в блоке catch в консоль уведомление об ошибке.
        try {
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
