package object_string.home_work_string;

public class NumberExceptions extends Exception {
    // Создать константы ошибок
    final static public int TOO_LONG = 1;
    final static public int TOO_SHORT = 2;
    final static public int NOT_STRING = 3;
    final static public int NULL_EXCEPTION = 4;
    private int code;

    public NumberExceptions(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
