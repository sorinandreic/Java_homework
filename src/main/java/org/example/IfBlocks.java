package org.example;

import java.util.Scanner;

public class IfBlocks {
    //Grade Calculator Write a Java program that takes a score (e.g., 87) as input and assigns a grade based on the score
    // (A for 90 and above, B for 80-89, C for 70-79, D for 60-69, and F for below 60) using if-else blocks. Print the grade.

    public void gradeCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the score to reveal your grade: ");
        int score = scanner.nextInt();
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Your grade is " + grade);
    }

    //Password Checker Implement a simple password strength checker in Java. If the password length is less than 8 characters, print "Weak Password".
    // If it has 8 or more characters but doesn't contain any number, print "Moderate Password". If it meets both conditions, print "Strong Password".

    public void passwordChecker() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your password(or just hit ENTER to exit): ");
            String password = scanner.nextLine().trim();
            if (password.isEmpty()) {
                break;
            }

            boolean containsNumber = false;
            for (char c : password.toCharArray()) {
                if (Character.isDigit(c)) {
                    containsNumber = true;
                }
            }

            if (password.length() > 8 && containsNumber) {
                System.out.println("Strong Password");
            } else if (password.length() > 8) {
                System.out.println("Moderate Password");
            } else {
                System.out.println("Weak password");
            }
        }

        System.out.println("Pasword checking completed");

    }

    //Leap Year
    //Write a Java program to check whether a year (input from the user) is a leap year or not. Remember,
    // a leap year is divisible by 4 but not by 100 unless it's also divisible by 400.

    public void leapYearChecker() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //read the input from the user
            System.out.println("Enter a year(or just hit ENTER to exit): ");

            String input = scanner.nextLine().trim();
            //if no input and press enter close app
            if (input.isEmpty()) {
                break;
            }
            int year = Integer.parseInt(input);

            if ((year % 400 == 0)
                    || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
        System.out.println("Check completed");
    }
}