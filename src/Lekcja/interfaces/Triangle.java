package Lekcja.interfaces;

public class Triangle implements Shape{

    private double height;
    private double a;
    private double b;
    private double c;

    public Triangle(double h, double a, double b, double c) {
        this.height = h;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
       return a + b + c;
    }

    @Override
    public double calculateParameter() {
            return (a * height) / 2;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Trójkąt, ");
        builder.append("wysokość: " + height + ", ");
        builder.append("bok A: " + a + ", ");
        builder.append("bok B: " + b + ", ");
        builder.append("bok C: " + c + ", ");
        builder.append("pole: " + calculateArea() + ", ");
        builder.append("obwód: " + calculateParameter() + ", ");
        return builder.toString();
    }
}
