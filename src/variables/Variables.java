package variables;

public class Variables {
    public static void main(String[] args) {
        byte b = 10;
        short s = 2000;
        int i = 247984984;
        long n = 999595959;
        float f = 5.7f;
        double d = 35.39;
        boolean bool = true;
        char c = 'D';
        String str = "MyString";

        String result = "";
        result += "Byte b =  " + b + "\n" ;
        result += "Short s = " + s + "\n";
        result += "int i = " + i + "\n";
        result += "Long n = " + n + "\n";
        result += "Float f = " + f + "\n";
        result += "Double d = " + d + "\n";
        result += "Boolean bool = " + bool + "\n";
        result += "Char c = " + c + "\n";
        System.out.println(result);

        String str_n = "53";
        int sum = Integer.parseInt(str_n) + 20;
        System.out.println(sum);
    }
}
