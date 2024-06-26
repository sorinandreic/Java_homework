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
        booleanExercises.compareAndPrint(5, 11);

        // Checking weather conditions
        booleanExercises.checkingWeatherConditions(true, true, false);
        booleanExercises.checkingWeatherConditions(false, true, false);
        booleanExercises.checkingWeatherConditions(false, false, false);

        //Print a Character
        CharExercises charExercises = new CharExercises();
        charExercises.charPrint();

        // Convert char
        charExercises.convertCase();

        //Concatenate Character with String
        charExercises.concatenateCharWithString();

        //Print a String
        StringExercises stringExercises = new StringExercises();
        stringExercises.printString();

        //Concatenate Two Strings
        stringExercises.concatenateStrings();

        //Replace Characters in a String
        stringExercises.replaceStringCharacters();

        //Basic Arithmetic Operators
        Operators operators = new Operators();
        operators.calculator();

        //Modulus Magic
        operators.modulusMagic();

        //Compound Assignment Operators
        operators.compoundAssignmentOperators();

        //Grade Calculator
        IfBlocks ifBlocks = new IfBlocks();
        ifBlocks.gradeCalculator();

        //Password Checker
        ifBlocks.passwordChecker();

        //Leap Year
        ifBlocks.leapYearChecker();

        // Days of the week
        SwitchEx switchEx = new SwitchEx();
        switchEx.weekDays();

        //Simple Calculator
        switchEx.simpleCalculator();

        //Trafic light Simulator
        switchEx.trafficLights();

    }

}
