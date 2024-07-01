package org.example;

import java.util.Scanner;

public class ForLoops {

    //Multiplication Table: Write a Java program that prints out the multiplication table for a number up to 10. For example,
    // if the user inputs 3, your program should print the multiplication table for 3 (3 x 1 = 3, 3 x 2 = 6, ..., 3 x 10 = 30) using a for loop.
    public void muliplicationTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n"
                +"Multiplication Table - Enter your number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }

    }

//Factorial Calculator: Create a program that calculates the factorial of a number provided by the user. Use a for loop to calculate the factorial.
// Remember, the factorial of n (n!) is the product of all positive integers less than or equal to n.

    public void factorialCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n"
                +"Factorial calculator - Enter your number: ");
        int n = scanner.nextInt();

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + "! = " + factorial);

    }

    //Countdown Timer: Implement a countdown timer that takes a number from the user and counts down to 0, printing each number.
    // Use a for loop for the countdown, and make sure to include a sleep of 1 second between each print to simulate a real timer.
    public void countdownTimer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n"
                +"Timer Countdown - Enter your number: ");
        int number = scanner.nextInt();
        System.out.println("Countdown started for " + number + " seconds!");
        int counter = 0;
        for (int i = number; i >= 0; i--) {
            counter = i;
            System.out.println(counter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
