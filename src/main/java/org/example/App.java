package org.example;

public class App {
    public static void main(String[] args) {
        //Rectangle perimeter;
        RectanglePerimeter rectangle = new RectanglePerimeter();
        rectangle.perimeter();

        // Minutes to Second converter;
        MinutesToSecondsConverter convertor = new MinutesToSecondsConverter();
        convertor.secondsToMinutes();

        // Square squareArea;
        SquareArea area = new SquareArea(5);
        area.squareaArea();

        //Cylinder volume calculator;
        CylinderVolumeCalculator volume = new CylinderVolumeCalculator();
        volume.volume();

        //Fahrenheit to Celsius calculator;
        TemperatureConverter tempConverter = new TemperatureConverter(98.5);
        tempConverter.fahrenheitToC();

        //Hypotenuse calculator;
        Hypotenuse hypotenuse = new Hypotenuse(3, 3);
        hypotenuse.hypotenuseCalculator();
    }


}
