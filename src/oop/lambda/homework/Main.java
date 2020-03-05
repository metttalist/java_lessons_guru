/*
Создайте массив целых чисел, например, из 10 элементов.
 Используя лямбда-выражение, отсортируйте массив по убыванию.
 Выведите массив, используя цикл foreach.
 */

package oop.lambda.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.setAll(numbers, i -> ~numbers[i]);
        Arrays.sort(numbers);
        Arrays.setAll(numbers, i -> ~numbers[i]);

//        Arrays.sort(numbers, (n1, n2) -> Integer.compare(n2, n1));
        for (int s : numbers) System.out.println(s);
    }
}
