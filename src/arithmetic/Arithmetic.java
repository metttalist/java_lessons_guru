package arithmetic;

public class Arithmetic {
    public static void main(String[] args) {

        int a = 30;
        int b = 20;
        int result = a + b;
        System.out.println("Сумма = " + result);
        result = a - b;
        System.out.println("Разность = " + result);
        result = a * b;
        System.out.println("Произведение = " + result);
        result = a / b;
        System.out.println("Деление = " + result);
        double d = (double) a / b;
        System.out.println("Деление = " + d);
        result = a % b;
        System.out.println("Остаток от деления = " + result);
        a++;
        System.out.println("Инкремент = " + a);
        b--;
        System.out.println("Дикремент = " + b);
    }
}
