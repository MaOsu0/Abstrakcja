package Lekcja.interfaces;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5,10);

        System.out.println("pole koła " + circle.calculateArea());
        System.out.println("obwód prostokontu " + rectangle.calculateArea());
    }
}
