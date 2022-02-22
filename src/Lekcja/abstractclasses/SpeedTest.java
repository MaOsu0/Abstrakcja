package Lekcja.abstractclasses;

public class SpeedTest {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle plane = new Plane();

        car.speedUp();
        plane.speedUp();

        System.out.println("Prędność samochodu: " + car.getSpeed());
        System.out.println("Prędność samolotu: " + plane.getSpeed());

    }
}
