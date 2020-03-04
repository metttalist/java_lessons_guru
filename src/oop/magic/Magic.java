package oop.magic;

public class Magic {
    public static void main(String[] args) {
        Point p = new Point(10, 20);
        System.out.println(p);

        String s = "Наш объект " + p;
        System.out.println(s);


//      КЛОНИРОВАНИЕ

        // Здесь по сути создали ссылку на объект, а не сам объект.
        Point p2 = p;
        System.out.println(p2);
        p.x = 30;
        System.out.println(p2);

        // создание нового объекта на основе предыдущего
        p2 = p.clone();
        p.x = 50;
        System.out.println(p2);
        System.out.println(p);

    }
}
