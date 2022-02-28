package Lekcja.interfaces;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ShapeCalculator {
    Scanner sc = new Scanner(System.in);

    public Circle readCircleData() {
        printText("Podaj promień");
        double r = sc.nextDouble();
        sc.nextLine();
        return new Circle(r);
    }

    public Rectangle readRectangleData() {
        printText("Podaj bok A:");
        double a = sc.nextDouble();
        printText("Podaj bok B:");
        double b = sc.nextDouble();
        sc.nextLine();
        return new Rectangle(a, b);
    }

    public Triangle readTriangleData() {
        printText("Podaj wysokość:");
        double height = sc.nextDouble();
        printText("Podaj bok A:");
        double a = sc.nextDouble();
        printText("Podaj bok B:");
        double b = sc.nextDouble();
        printText("Podaj bok C:");
        double c = sc.nextDouble();
        sc.nextLine();
        return new Triangle(height, a, b, c);
    }

    public Shape createShape() {
        int shapeType = sc.nextInt();
        sc.nextLine();
        switch (shapeType) {
            case Shape.CIRCLE -> readCircleData();
            case Shape.RECTANGLE -> readRectangleData();
            case Shape.TRIANGLE -> readTriangleData();
            default -> throw new NoSuchElementException();
        }
        return createShape();
    }

    public String printText(String text) {
        return text;
    }

}
