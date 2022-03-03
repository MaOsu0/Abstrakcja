package Zadanie1;

class Circle implements Shape{
    private final double R;

    private Circle(double r) {
        this.R = r;
    }

    public static Circle createCircle(double r) {
        return new Circle(r);
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}
