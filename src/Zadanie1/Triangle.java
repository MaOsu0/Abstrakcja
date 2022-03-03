package Zadanie1;

class Triangle implements Shape{

    private final double A;
    private final double B;
    private final double C;
    private final double HEIGHT;

    private Triangle(double a, double b, double c, double HEIGHT) {
        A = a;
        B = b;
        C = c;
        this.HEIGHT = HEIGHT;
    }
    public static Triangle createTriangle(double a, double b, double c, double HEIGHT) {
        return new Triangle(a, b, c, HEIGHT);
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
