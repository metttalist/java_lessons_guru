package oop.extend;

import oop.static_data.Person;

public class Worker extends Person {
    private int salary = 0;

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getTextInfo(){
        // вызов метода из родительского класса
        String s = super.get_text_info();
        s += "; Зар.плата: " + this.salary + " $";
        return  s;
    }
}
