package Lekcja.interfaces;

interface Shape {
    double PI = 3.14;

    double calculateArea();
    double calculateParameter();

    default String getData() {
        return "Pole: " + calculateArea() + ", obwód: " + calculateParameter();
    }
}
