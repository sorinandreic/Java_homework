package org.example;

public class StringExercises {


    //Write a program that initializes a String variable with a value and prints it.
    public void printString() {
        String hello = "Hello World";
        System.out.println(hello);
    }


    //Create a program that concatenates two strings and prints the result.
    public void concatenateStrings() {
        String firstString = "DNA stands for: ";
        String secondString = "Deoxyribonucleic acid.";
        String concatenatedString = firstString + secondString;
        System.out.println(concatenatedString);
    }

    //Write a program that replaces all occurrences of a specified character in a string with another character. Challenge: Explore Java's built-in methods for various data types.
    public void replaceStringCharacters() {

        String originalString = "Explore Java's built-in methods for various data types.";
        char oldChar = 'e';
        char newChar = '3';
//.replace
        String replacedString = originalString.replace(oldChar, newChar);
        System.out.println("Method 1- " + replacedString);

//replaceAll
        String secondReplacedString = originalString.replaceAll("a", "4");
        System.out.println("Method 2- " + secondReplacedString);
    }
}
