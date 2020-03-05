package oop.lambda;

import array.Array;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        String[] arr = {"Hello ", "Dan", "!"};
        Arrays.sort(arr, new MyCompare());
        for (String s : arr) System.out.println(s);
        System.out.println("**********************");

        // вывод массива с помощью лямбда выражения
        Arrays.sort(arr, (s1, s2) -> Integer.compare(s2.length(), s1.length()));
        for (String s : arr) System.out.println(s);

        List<String> arr_new = Arrays.asList("A", "AB", "ABC");
        arr_new.forEach((t) -> {
            System.out.println(t);
        });
        arr_new.forEach(System.out::println);
    }
}


