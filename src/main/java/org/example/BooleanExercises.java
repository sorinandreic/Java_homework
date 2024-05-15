package org.example;

import java.util.Random;

public class BooleanExercises {
    double rainForecast;
    private boolean raining;
    private Random random;

    public BooleanExercises(boolean isRaining, double rainForecast) {
        this.raining = isRaining;
        this.rainForecast = rainForecast;
        this.random= new Random();
    }


    public boolean isRaining() {
        return raining;
    }

    public void setRaining(boolean raining) {
        this.raining = raining;
    }

    public double getRainForecast() {
        return rainForecast;
    }

    public void setRainForecast(double rainForecast) {
        this.rainForecast = rainForecast;
    }

    public void printForecast() {
        double chanceOfRain =random.nextDouble()*100;
        if (chanceOfRain > 50) {
            raining = true;
            System.out.println("Raining forecast is " + raining + ". It will rain today!");
        } else {
            raining = false;
            System.out.println("Raining forecast is " + raining + ". Today will be sunny.");
        }

    }

}
