package org.example;

import java.util.Random;
import java.util.Scanner;

public class WhileLoops {
    Scanner scanner = new Scanner(System.in);


    //Input Summation: Write a Java program that continuously takes numbers as input from the user and adds them to a sum.
    // The loop should continue until the user enters 0, at which point the program should print the final sum and exit.
    public void inputSummation() {
        int sum = 0;
        System.out.print("Input Summation(or 0 to exit) \n");
        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            if (number == 0) {
                break;
            }
            sum += number;

        }
        System.out.println("The sum is: " + sum + "\n");

    }

    //Guessing Game: Implement a guessing game where the program selects a random number between 1 and 100, and the user has to guess it.
    // Use a while loop to allow the user unlimited attempts until they guess the number correctly.
    // After each guess, the program should tell the user if the guess is too high or too low.


    public void guessingGame() {
        Random random = new Random();
        int myNumber = random.nextInt(100) + 1;
        int guessedNumber = 0;
        System.out.println("Guess the number I'm thinking of between 1 and 100");

        while (true) {
            System.out.println("Enter your number: ");
            guessedNumber = scanner.nextInt();
            if (guessedNumber < 1 || guessedNumber > 100) {
                System.out.println("Please enter a number between 1 and 100");
                continue;
            }
            if (guessedNumber < myNumber) {
                System.out.println("Too low");
            } else if (guessedNumber > myNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("Congratulations! You guessed it!");
                break;
            }

        }
    }

    //Palindrome Checker: Create a Java program that checks if a given string is a palindrome. Use a while loop to compare characters from the beginning and the end of the string, moving towards the center.
    //A palindrome reads the same backward as forward, like "radar" or "level".
    public void palindromeChecker() {
        System.out.println("Enter a string to check if it's a palindrome: ");
        String input = scanner.next();
        palChecker(input);

    }

    public void palChecker(String input) {
        input = input.toLowerCase();
        boolean result = true;
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                result = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Palindrome checker: " + result);
    }
}
