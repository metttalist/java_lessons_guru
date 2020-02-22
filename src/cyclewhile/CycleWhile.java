package cyclewhile;

import javax.swing.*;

public class CycleWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 20){
//            System.out.print(i + " ");
            i ++;
        }
        String in;
        in = JOptionPane.showInputDialog(null, "Введите положительное число", JOptionPane.INFORMATION_MESSAGE);
        if (in != null && !in.equals("")){
            int n = Integer.parseInt(in);
            if (n < 0){
                System.out.println("Вы ввели отрицательное число");
            }
            else {
                int sum = 0;
                i = 0;
                while (i <= n){
                    sum += i;
                    i ++;
                }
                    System.out.println(sum);
            }
        }
        else {
            System.out.println("Вы не ввели число");
        }
    }
}
