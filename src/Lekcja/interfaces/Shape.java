package Lekcja.interfaces;

interface Shape {
    int CIRCLE = 1;
    int RECTANGLE = 2;
    int TRIANGLE = 3;

    double PI = 3.14;

    double calculateArea();
    double calculateParameter();

    default String getData() {
        return "Pole: " + calculateArea() + ", obwód: " + calculateParameter();
    }
}
