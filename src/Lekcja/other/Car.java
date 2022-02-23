package Lekcja.other;

public interface Car {
    public default void printName() {
        System.out.println("Samochód");
    }
}
