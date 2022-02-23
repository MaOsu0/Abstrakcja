package Lekcja.other;

public interface Example {

    default void complicateMetdos() {
         read();
         calculate();
         save();
    }

    private void read() {

    }

    private void calculate(){

    };

    private void save() {

    }
}
