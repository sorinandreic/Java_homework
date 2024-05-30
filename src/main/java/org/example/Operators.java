package org.example;

import java.util.Scanner;

public class Operators {

    //Create a Java program that takes two integers as input and prints their sum, difference, multiplication, and division. Make sure to handle division by zero gracefully.
    public void calculator() {
        int a = 3;
        int b = 0;

        int sum = a + b;
        System.out.println("Sum 3 + 0 = " + sum);

        int diff = a - b;
        System.out.println("Difference 3 - 0 = " + diff);

        int mul = a * b;
        System.out.println("Multiplying 3 * 0 = " + mul);
        try {
            int divByZero = a / b;
            System.out.println("Division 3 / 0 = " + divByZero);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero iis not allowed!");
        }


    }

    //Write a Java program that checks if a number (input from the user) is even or odd without using any conditional statements (hint: use the modulus operator).
    public void modulusMagic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number to check if it's even or odd: ");

        int userNumber = scanner.nextInt();
        String[] results = {"Even", "Odd"};

        String result = results[userNumber % 2];

        System.out.println("The number " + userNumber + " is " + result);
    }

    //Create a program that demonstrates the use of compound assignment operators like +=, -=, *=, and /= with some integers. Print the result after each operation to see the effect.
    public void compoundAssignmentOperators() {
        //initial values
        int initNnumber = 10;
        int secondNumber = 5;

        // Print initial int value
        System.out.println("Initial value is " + initNnumber);

        // +=
        int number = initNnumber;
        System.out.println("Ater +=5 value is " + (number += secondNumber));

        // -=
        number = initNnumber;
        System.out.println("After -=5 value is " + (number -= secondNumber));

        // *=
        number = initNnumber;
        System.out.println("At *=5 value is " + (number *= secondNumber));

        // /=
        number = initNnumber;
        System.out.println("At /=5 value is " + (number /= secondNumber));

    }
}

