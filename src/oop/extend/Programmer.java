package oop.extend;

import oop.static_data.Person;

// Наследование от Person
public class Programmer extends Person {
    // переменная
    private int exp;

    // конструктор
    public Programmer(String name, String city, int age, int exp){
        // вызов родительского конструктора
        super(name, city, age);
        // определение ещё одного поля
        this.exp = exp;
    }

    public Programmer(){
        super();
        this.exp = 0;
    }

    public String getTextInfo(){
        // вызов метода из родительского класса
        String s = super.get_text_info();
        s += "; Опыт " + this.exp + " лет";
        return  s;
     }
}
