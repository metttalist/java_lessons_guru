
package oop.interfaces;

public interface DrawShape {
    
    public void draw();
    
    default void hello() {
        System.out.println("Hello World!");
    }
    
}
