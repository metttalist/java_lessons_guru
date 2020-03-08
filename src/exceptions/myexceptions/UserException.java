package exceptions.myexceptions;

public class UserException extends Throwable {
    //    Создание констант(т.к. константы принадлежат классу, а не объекту - делаем их статическими)
    final static public int SHORT_LOGIN = 1;
    final static public int LONG_LOGIN = 2;
    private int code;

    public UserException(int code) {
        this.code = code;
    }

    public int getCode(){
        return code;
    }
}
