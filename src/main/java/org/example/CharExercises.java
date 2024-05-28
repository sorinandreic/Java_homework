package org.example;

public class CharExercises {


    //Create a program that initializes a char variable with a letter, then prints this character.
    public void charPrint() {
        char character = 'A';
        System.out.println("First letter of alphabet is : " + character);
    }


    //Write a program that converts a lowercase letter to uppercase and vice versa. This exercise does not use conditional statements, so you'll need to use two predefined characters.
    public void convertCase() {

        char lowercaseChar = 'a'; // Example lowercase character
        char uppercaseChar = 'A'; // Example uppercase character

        // Convert lowercase to uppercase and vice versa.
        char convertedToUpper = Character.toUpperCase(lowercaseChar);
        char convertedToLower = Character.toLowerCase(uppercaseChar);

        System.out.println("Original char: " + lowercaseChar + " -> Converted to uppercase: " + convertedToUpper);
        System.out.println("Original char: " + uppercaseChar + " -> Converted to lowercase: " + convertedToLower);
    }


    //Create a program that demonstrates how to add a character to both the beginning and end of a string. This exercise will help you understand how characters and strings can be combined to create new string values.
    public void concatenateCharWithString() {

        char character = 'a';
        String word = "lamab";

        char uppercaseChar = Character.toUpperCase(character);
        String concatenatedString = uppercaseChar + word + character;

        System.out.println("Sweet home " + concatenatedString + "!");
    }
}
