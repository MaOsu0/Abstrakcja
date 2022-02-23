package Lekcja.other;

public class Amphibi implements Car, Boat{

    @Override
    public void printName() {
        System.out.println("Amfibi to troche: ");
        Car.super.printName();
        System.out.println("a trochę");
        Boat.super.printName();
    }
}
