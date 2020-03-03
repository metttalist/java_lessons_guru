package oop.generic;

public class Generic {
    public static void main(String[] args) {
//      Создание переменной с указанными параметрами(в квадратных скобках < >)
        Test <Integer, String> t = new Test<Integer, String>(10, "Привет");
        t.print();
        t.setData_1(11);
        System.out.println(t.getData_1());
        t.setData_2("Дэнчик");
        System.out.println(t.getData_2());
//      Создание переменной без указания параметров
        Test t1 = new Test(true, false);
        t1.print();
    }
}
