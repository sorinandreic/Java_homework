package org.example;

public class TemperatureConverter {
    double fahrenheit;

    public TemperatureConverter(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    public void fahrenheitToC() {
        System.out.println("98.5 Fahrenheit to Celsius is " + (fahrenheit-32)*(5.0/9.0));
    }
}
