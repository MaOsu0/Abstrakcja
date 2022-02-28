package Lekcja.interfaces;

public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double calculateArea() {
        return Shape.PI * r * r;
    }

    public double calculateParameter() {
        return 2 * Shape.PI * r;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Okrąg, ");
        builder.append("promień: " + r + ", ");
        builder.append("pi: " + PI + ", ");
        builder.append("pole: " + calculateArea() + ", ");
        builder.append("obwód: " + calculateParameter() + ", ");
        return builder.toString();
    }
}
