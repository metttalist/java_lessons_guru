package oop.magic;

public class Point implements Cloneable {
    public int x;
    public int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Точка с координатами (" + x + ", " + y + ")";
    }

    // метод для клонирования
    public Point clone(){
        return new Point(x, y);
    }
}
