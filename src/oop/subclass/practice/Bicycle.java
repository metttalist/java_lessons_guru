/*
Создание класса велосипед(Bicycle) с вложенными классами управление(SteeringWheel) и седушка(Seat)
 */

package oop.subclass.practice;

//Основной класс
public class Bicycle {

    private String model;
    private int weight;

    public Bicycle(String model, int weight){
        this.model = model;
        this.weight = weight;
    }

    public void start(){
        System.out.println("Поехали!!!");
    }

//  вложенный класс
    public class SteeringWheel{
        public void right(){
            System.out.println("Руль вправо!");
        }

        public void left(){
            System.out.println("Руль влево!");
        }
    }

//  вложенный класс
    public class Seat{
        public void up(){
            System.out.println("Сиденье выше!");
        }

        public void down(){
            System.out.println("Сиденье ниже!");
        }
    }
}
