package oop.abstractclass;

//Создание абстрактного класса. Для приведения к абстрактному классу используется слово abstract.
public abstract class Weapon {
    private String name;

//  абстрактные методы обязательно должны быть реализованы в классах наследниках
    public abstract void foo();
}
