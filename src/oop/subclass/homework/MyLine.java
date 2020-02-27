/*
Создайте класс MyLine.
Создайте внутренний класс MyPoint с public-полями x и y.
Добавьте public-поля pointStart, pointEnd, в которых будут храниться объекты класса Point.
Создайте конструктор в классе MyLine, в котором должно быть 4 параметра: x и y начальной точки и x и y конечной точки.
Внутри конструктора MyLine создайте на их основе два объекта Point и запишите их в соответствующие поля.
Создайте объект класса MyLine.
Выведите в основном классе в консоль координаты начальной и конечной
точки в таком виде: «Начальная точка (5, 7); Конечная точка (10, 3);».
 */

package oop.subclass.homework;

import com.sun.xml.internal.bind.v2.TODO;
import oop.subclass.Firm;
import sun.java2d.loops.ProcessPath;

public class MyLine {
    public MyPoint start_x;
    public MyPoint start_y;
    // Создайте конструктор в классе MyLine, в котором должно быть 4 параметра: x и y начальной точки и x и y конечной точки.
    public MyLine(double start_x, double start_y, double end_x, double end_y){
        // Внутри конструктора MyLine создайте на их основе два объекта MyPoint и запишите их в соответствующие поля.
        this.start_x = new MyPoint();
        this.start_y = new MyPoint();
    }
    class MyPoint{
        // Создайте внутренний класс MyPoint с public-полями x и y.
        public double x;
        public double y;
        //Добавьте public-поля pointStart, pointEnd, в которых будут храниться объекты класса Point.
        public double pointStart;
        public double pointEnd;

    }
    MyLine m = new MyLine(5,7,8,9);

    public static void main(String[] args) {
        /*
        Выведите в основном классе в консоль координаты начальной и конечной
        точки в таком виде: «Начальная точка (5, 7); Конечная точка (10, 3);».
         */
//        TODO не работает. Может быть связано с тем, что не до конца понятно т.з
//        System.out.println("Начальная точка" + start_x + ";");
    }
}
