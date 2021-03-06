package oop.static_data;

public class Person {
    //  модификатор доступа везде и отовсюду
    public String name;

    //  модификатор доступа только внутри пакета в классах наследниках
    protected String city;

    //  модификатор доступа только внутри класса
    private int age;

    //  создание статической переменной
    public static int count = 0;

    //  создание конструктора
    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
        count++;
    }
    //  создание ещё одного конструктора для перегрузки
    public Person(){
//      передача новых данных в текущий конструктор
        this("Default name", "Default city", 18);
    }

    public String get_text_info(){
        return "Имя " + this.name + "; Город " + this.city + "; Возраст " + this.age;
    }

    //  создание геттеров
    public String getName(){
        return this.name;
    }

    public String getCity() {
        return city;
    }

    public int getAge(){
        return age;
    }

    //  создание сеттеров
    public void setName(String name){
        this.name = name;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setAge(int age){
        this.age = age;
    }

    //  перегрузка сеттеров
    public void setName(){
//      вызов уже существующего метода(сеттера)
        setName("Default name");
    }

    public void setCity(){
//      вызов уже существующего метода(сеттера)
        this.setCity("Default city");
    }

    public void setAge(){
//      то же что и вызов сеттера. Можно сделать и так
        this.age = 18;
    }

    //  создание отдельного метода
//    public void who_is_older(oop.access.Person p){
//        if (this.age > p.age)System.out.println(this.name + " старше чем " + p.name);
//        else if (this.age == p.age) System.out.println(this.name + " и " + p.name + " ровесники ");
//        else System.out.println(this.name + " младше чем " + p.name);
//    }

    public static int getCount(){
        return count;
    }
}
