package oop.anonymous;

public class Anonymous {
    public static void main(String[] args) {
        Shape p = new Shape(10, 20) {
            public void draw(){
                System.out.println("Рисуем точку с координатами (" + x + ", " + y + ")");
            }
        };
        p.draw();

        DrawShape ds = new DrawShape() {
            @Override
            public void draw() {
                System.out.println("Рисование фигуры");
            }
        };

        ds.draw();
    }
}
