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
        return sizeData.getValueOfPi() * R * R;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * R * sizeData.getValueOfPi();
    }
}
