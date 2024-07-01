package org.example;

import java.util.Scanner;

public class SwitchEx {

//    Day of the Week: Write a Java program that asks the user for a number (1-7)
//    and prints the day of the week corresponding to that number using a switch statement (1 for Monday, 2 for Tuesday, etc.).

    public void weekDays() {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("\n"
                    + "Day of the week \n"
                    + "Enter a number between 1 and 7(or just hit ENTER to exit)");
            String dayNumber = scanner.nextLine().trim();
            //if no input and press enter close app
            if (dayNumber.isEmpty()) {
                break;
            }
            int dayNo = Integer.parseInt(dayNumber);

            String day;
            switch (dayNo) {
                case 1:
                    day = "Monday";
                    break;
                case 2:
                    day = "Tuesday";
                    break;
                case 3:
                    day = "Wednesday";
                    break;
                case 4:
                    day = "Thursday";
                    break;
                case 5:
                    day = "Friday";
                    break;
                case 6:
                    day = "Saturday";
                    break;
                case 7:
                    day = "Sunday";
                    break;
                default:
                    day = "Invalid number, chose a number between 1 and 7";

            }
            System.out.println(day);
        }
    }

    //Simple Calculator: Create a Java program that acts as a simple calculator.
    // The program should take three inputs: two numbers and an operator (+, -, *, /) and perform the operation using a switch statement.


    public void simpleCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n"
                + "Simple Calculator\n"
                + "Enter the first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the operator(+,-,*,/)");
        char operator = scanner.next().charAt(0);
        System.out.println("Enter the second number");
        int secondNumber = scanner.nextInt();

        int result;

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;

                break;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Division by zero is not accepted");
                    return;
                }
                break;
            default:
                System.out.println("Operator is not accepted");
                return;
        }
        System.out.println("The result is: " + result);
    }


//Traffic Light Simulator: Simulate a traffic light using a switch statement.
// The user inputs one of three colors (red, yellow, green), and the program prints out what a driver should do (e.g., "Stop" for red).

    public void trafficLights() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n"
                + "Traffic Lights Sumulator \n"
                + "Enter a traffic light colour");
        String colour = scanner.nextLine().trim();

        switch (colour) {
            case "red":
                System.out.println("STOP");
                break;
            case "yellow":
                System.out.println("Prepare to stop");
                break;
            case "green":
                System.out.println("GO");
                break;
            default:
                System.out.println("Invalid traffic colour");
                return;

        }
    }


}
