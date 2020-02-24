/*
Создайте массив из 5 чисел типа double.
Используя цикл while, выведите сумму всех чисел массива.
Используя цикл for, выведите произведение всех чисел массива.
 */

package array;

public class HomeworkArray {
    public static void main(String[] args) {
//      Создайте массив из 5 чисел типа double.
        double[] d_arr = {1, 2, 3, 4, 5};
        double while_sum = 0;
//      Используя цикл while, выведите сумму всех чисел массива.
        int i = 0;
        while (i < d_arr.length) {
            while_sum += d_arr[i];
            i++;
        }
        System.out.println("Сумма всех чисел массива = " + while_sum);
//      Используя цикл for, выведите произведение всех чисел массива.
        double product_numbers = 1;
        for (int x = 0; x < d_arr.length; x++) {
            product_numbers *= d_arr[x];
        }
        System.out.println("Произведение всех чисел массива = " + product_numbers);
    }
}
