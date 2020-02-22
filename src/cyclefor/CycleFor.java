package cyclefor;

public class CycleFor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) System.out.print(i + " ");
        System.out.println();
        for (int n = 0; n < 50; n++) if (n % 2 == 0) System.out.print(n + " ");
        System.out.println();
        int sum = 0;
        int n = 10;
        for (int i = 0; i <= n; i += 2) {
            sum += i;
        }
        System.out.println();
        System.out.println("Сумма всех чётных чисел от 0 до " + n + " = " + sum);
    }
}
