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

        //Booleaan value assignment and printing;
        BooleanExercises booleanExercises = new BooleanExercises();
        booleanExercises.moon();

        //Boolean Comparison
        BooleanExercises booleanExercises1 = new BooleanExercises();
        booleanExercises1.compareAndPrint(5, 11);

        // Checking weather conditions
        BooleanExercises booleanExercises2 = new BooleanExercises();
        booleanExercises2.checkingWeatherConditions(true, true, false);
        booleanExercises2.checkingWeatherConditions(false, true, false);
        booleanExercises2.checkingWeatherConditions(false, false, false);

        //Print a Character
        CharExercises charExercises = new CharExercises();
        charExercises.charPrint();

        // Convert char
        CharExercises charexercises2 = new CharExercises();
        charexercises2.convertCase();

        //Concatenate Character with String
        CharExercises charexercises3 = new CharExercises();
        charexercises3.concatenateCharWithString();

        //Print a String
        StringExercises stringExercises = new StringExercises();
        stringExercises.printString();

        //Concatenate Two Strings
        StringExercises stringExercises1 = new StringExercises();
        stringExercises1.concatenateStrings();

        //Replace Characters
        StringExercises stringExercises2 = new StringExercises();
        stringExercises2.replaceStringCharacters();

    }

}
