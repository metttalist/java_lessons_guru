package bitoperations;

public class Bitoperations {
    public static void main(String[] args) {
        int a = 4;
        int b =7;
        int c = 2;
        int d = 3;
        String s_a = Integer.toBinaryString(a);
        String s_b = Integer.toBinaryString(b);
        System.out.println("s_a = " + s_a);
        System.out.println("s_b = " + s_b);
        System.out.println(s_a + " & " + s_b + " = " + Integer.toBinaryString(a & b)); // *
        System.out.println(s_a + " | " + s_b + " = " + Integer.toBinaryString(a | b)); // +
        System.out.println(s_a + " ^ " + s_b + " = " + Integer.toBinaryString(a ^ b)); //
        System.out.println(s_a + " ~ " + s_b + " = " + Integer.toBinaryString(~a)); // -
    }
}
