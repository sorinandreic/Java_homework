package org.example;

public class Hypotenuse {
    double shortSide1;
    double shortSide2;

    public double getShortSide1() {
        return shortSide1;
    }

    public void setShortSide1(int shortSide1) {
        this.shortSide1 = shortSide1;
    }

    public double getShortSide2() {
        return shortSide2;
    }

    public void setShortSide2(int shortSide2) {
        this.shortSide2 = shortSide2;
    }

    public Hypotenuse(double shortSide1, double shortSide2) {
        this.shortSide1 = shortSide1;
        this.shortSide2 = shortSide2;

    }

    public void hypotenuseCalculator() {
        double squareOfSides = Math.pow(shortSide1, 2) + Math.pow(shortSide2, 2);
        System.out.println("Hypotenuse is: " + Math.sqrt(squareOfSides));
    }
}
