package org.example;

public class CylinderVolumeCalculator {
    double radius = 4.4;
    double height = 10.5;

    public void volume() {
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Cylinder volume is " + volume);
    }
}
