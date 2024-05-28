package org.example;

public class BooleanExercises {

    public void moon() {
        boolean isMoonMadeFromCheese = false;

        System.out.println("True or False: The moon is made of cheese. (" + isMoonMadeFromCheese + ", but it would be the biggest piece of cheese!)");
    }

    public void compareAndPrint(int a, int b) {

        boolean isLessThan = a < b;
        boolean isGreaterThan = a > b;
        boolean isEqual = a == b;
        boolean isNotEqual = a != b;
        boolean isLessThanOrEqual = a <= b;
        boolean isGreaterThanOrEqual = a > b;


        System.out.println(a + " < " + b + "  : " + isLessThan);
        System.out.println(a + " > " + b + "  : " + isGreaterThan);
        System.out.println(a + " == " + b + " : " + isEqual);
        System.out.println(a + " != " + b + " : " + isNotEqual);
        System.out.println(a + " <= " + b + " : " + isLessThanOrEqual);
        System.out.println(a + " >= " + b + " : " + isGreaterThanOrEqual);

    }

    public void checkingWeatherConditions(boolean isSunny, boolean isWarm, boolean chanceOfRain) {
        boolean shouldGoOut;
        if (isSunny && isWarm && !chanceOfRain) {
            shouldGoOut = true;
            System.out.println("Should I go out? " + shouldGoOut + ", is warm and sunny!");

        } else if (!isSunny && isWarm && !chanceOfRain) {
            shouldGoOut = true;
            System.out.println("Should I go out? " + shouldGoOut + ", it is warm and there is no chance of rain!");

        } else {
            shouldGoOut = false;
            System.out.println("Should I go out? " + shouldGoOut + ", it is not a good time to go outside!");

        }
    }
}
