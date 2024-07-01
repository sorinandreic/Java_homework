package org.example;

import java.util.Random;
import java.util.Scanner;

public class BreakAndContinue {

    //    Find the First Positive Divisor: Write a Java program that finds the first positive divisor (other than 1)
//    of a number entered by the user. Use a loop and a break statement when the divisor is found.
    Scanner scanner = new Scanner(System.in);


    public void positiveDivisor() {
        System.out.println("\n" +
                "Enter a number to reveal it's first positive divisor(other than 1) : ");
        int number = scanner.nextInt();

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                number = i;
                break;
            }
        }
        if (number != 1) {
            System.out.println("The first positive divisor other than 1 is: " + number + "\n");
        } else {
            System.out.println("No other positive divisor found");
        }
    }

    //
    public void skipNegativeNumbers() {

        int sum = 0;

        while (true) {
            System.out.print("Skip negative numbers and sum up the positive ones\n"
                    + "Enter the number (0 will stop the program): ");
            int number = scanner.nextInt();

            // If the user enters 0, break the loop
            if (number == 0) {
                break;
            }
            //if the number is negative skip it
            if (number < 0) {
                continue;
            }

            sum += number;
        }

        // print the final sum
        System.out.println("The sum of positive numbers is: " + sum + "\n");

    }

    //Guess the Number Game: Implement a simple "guess the number" game where the program randomly selects a number between 1 and 10, and the user has a maximum of 5 attempts to guess it.
    //Use a loop with a break statement to end the game if the user guesses correctly or uses up all attempts.

    public void guessTheNumber() {
        Random random = new Random();
        int secretNumber = random.nextInt(10) + 1;
        int numberOfAttempts = 5;
        int userGuess;
        boolean hasGuessed = false;
        System.out.println("Guess the Number Game\n"
                + "Can you read my mind and guess the number I'm thinking of from 1 to 10? You have 5 attempts left");

        for (int attempt = 1; attempt <= numberOfAttempts; attempt++) {
            userGuess = scanner.nextInt();
            if (userGuess == secretNumber) {
                hasGuessed = true;
                break;
            } else if (userGuess < 1 || userGuess > 10) {
                System.out.println("Your number is not in the range. Please enter a number between 1 and 10.");
            } else {
                System.out.println("Wrong guess! Try again! You have " + (numberOfAttempts - attempt) + " attempts left");

            }
        }
        if (hasGuessed) {
            System.out.println("Wow, you are a mind reader!");
        } else {
            System.out.println("Sorry, the number was " + secretNumber + "!");
        }
    }
}
