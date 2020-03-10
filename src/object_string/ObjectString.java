package object_string;

public class ObjectString {
    public static void main(String[] args) {
        char[] c_arr = {'a', 'b', 'c', 'd'};
        String s1 = new String(c_arr);
        System.out.println(s1);
        String s2 = "My new string";
        String s3 = "My new string";

        System.out.println(s2.charAt(1)); //                 charAt() Вывод симвлоа по индексу.
        System.out.println(s2.equals(s3)); //                equals()  Проверка объектов на равенство
        System.out.println(s2.startsWith("My")); //          startsWith() Проверка начинается ли строка на переданную строку.
        System.out.println(s2.endsWith("My")); //            startsWith() Проверка заканчиваается ли строка на переданную строку.
        System.out.println(s2.indexOf("My")); //             indexOf() Индекс с которого начинается вхождение.
        System.out.println(s2.lastIndexOf("My")); //      lastIndexOf() Индекс с котором заканчвается вхождение. Если нет - то вернёт -1
        System.out.println(s1.length()); //                  length()  Длина строки
        System.out.println(s2.replace('y', 't')); //   replace() Меняет один элемент на другой.
        System.out.println(s2.substring(5)); //              substring() Создаёт новую строку начиная от элемента переданного в параметрах.
        System.out.println(s2.substring(5, 10)); //     substring() Создаёт новую строку начиная от 1-го по 2-й элементами переданными в параметрах. Последний элемент в период не входит.
        System.out.println(s3.toUpperCase()); //             toUpperCase() приводит строку к верхнему регистру
        String user_data = "      ddd@dd.ru           ";
        System.out.println(user_data.trim()); //             trim() удаляет все пробелы
    }
}
