package object_string.home_work_string;

public class TooLongException extends Throwable {
    public String toString(){
        return "Выражение слишком длинное!";
    }
}
