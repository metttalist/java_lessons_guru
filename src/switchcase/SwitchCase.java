package switchcase;

public class SwitchCase {
    public static void main(String[] args) {
        int a = 3;
        String s;
            a = 1;
        while (true) {
            switch (a) {
                case 1:
                    s = "Один";
                    break;
                case 2:
                    s = "Два";
                    break;
                case 3:
                    s = "Три";
                    break;
                default:
                    s = "Другое число";
            }
            System.out.println(a + " - " + s);
            a++;
            if (a > 4)break;
        }
    }
}
