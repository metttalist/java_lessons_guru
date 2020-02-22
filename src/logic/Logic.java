package logic;

public class Logic {
    public static void main(String[] args) {
        boolean b_1 = true; // 1
        boolean b_2 = false; // 0
        System.out.println(b_1 + " && " + b_2 + " = " + (b_1 && b_2)); // 1 * 0
        System.out.println(b_1 + " || " + b_2 + " = " + (b_1 || b_2)); // 1 + 0
        System.out.println(b_1 + " ^ " + b_2 + " = " + (b_1 ^ b_2)); /* Будет true только тогда когда значения операндов различны (false, true)*/
        System.out.println("Было " + b_1 + " Стало " + !b_1); /* Инвертирование */
        System.out.println("Было " + b_2 + " Стало " + !b_2); /* Инвертирование */
    }
}
