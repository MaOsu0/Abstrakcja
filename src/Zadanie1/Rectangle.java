package Zadanie1;

class Rectangle implements Shape {
    private final double A;
    private final double B;

    private Rectangle(double a, double b) {
        A = a;
        B = b;
    }

    public static Rectangle createRectangle(double a, double b) {
        return new Rectangle(a, b);
    }

    @Override
    public double calculateArea() {
        return A * B;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * A + 2 * B;
    }
}
