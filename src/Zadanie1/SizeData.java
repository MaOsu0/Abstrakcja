package Zadanie1;

enum SizeData {
   PI(3.14);

    private final double valueOfPi;

    SizeData(double valueOfPi) {
        this.valueOfPi = valueOfPi;
    }

    public Double getValueOfPi() {
        return valueOfPi;
    }
}
