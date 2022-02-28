package Lekcja.interfaces;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class main {
    public static void main(String[] args) {
        boolean isTrue = false;

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        Shape shape = null;

        while (!isTrue) {
            try {
                shapeCalculator.printOption();
                shape = shapeCalculator.createShape();
                isTrue = true;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadziłeś dane w złym formacie, spróbuj ponownie");
            } catch (NoSuchElementException e) {
                shapeCalculator.printText("Brak elementu");
            }
            finally {
                shapeCalculator.sc.nextLine();
            }
            shapeCalculator.printText(shape.toString());
            shapeCalculator.sc.close();
        }
    }
}