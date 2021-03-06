/*
Создайте объект и запишите в него массив целых чисел (для примера, пусть это будут id товаров в магазине).
Создайте ещё один объект и запишите в него массив строк (для примера, пусть это будут названия товаров в магазине).
Вызовите у обоих объектов метод printObject().
 */

package oop.generic.homework;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5}; // массив целых чисел (для примера, пусть это будут id товаров в магазине).
        Shop ids = new Shop(arr);// Создайте объект и запишите в него массив целых чисел (для примера, пусть это будут id товаров в магазине).
        ids.printObject();//  Вывод в консоль элементов массива

        Integer[] arr1 = new Integer[]{10}; // массив из одного числа
        Shop id = new Shop(arr1); // присваивание объекту массива из одного числа
        id.printObject(); // Вывод информации

        String[] arr2 = new String[]{"Хлеб", "Молоко", "Яйцо", "Масло"}; // массив строк
        Shop names = new Shop(arr2);// Создайте ещё один объект и запишите в него массив строк (для примера, пусть это будут названия товаров в магазине).
        names.printObject(); // Вывод информации
    }
}
