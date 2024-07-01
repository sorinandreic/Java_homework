package org.example;

import java.util.Scanner;

public class ForEachLoop {
    Scanner sc = new Scanner(System.in);

    //Count Vowels: Create a program that counts the number of vowels in a given string.
    // Use a for-each loop to iterate through the characters of the string. Consider A, E, I, O, U as vowels for this exercise.

    public void countTheVowels(String word) {
        int count = countVowels(word);
        System.out.println("The given string is: " + word);
        System.out.println("The number of vowels is " + count);

    }

    public static int countVowels(String input) {
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char ch : input.toCharArray()) {
            for (char vowel : vowels) {
                if (ch == vowel) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    //Find the Maximum: Write a Java program that finds the maximum value in an array of integers.
    // Use a for-each loop to iterate through the array. You can initialize the array with some values or take the input from the user.
    public void findTheMax() {
        int[] array = new int[4];
        System.out.println("Enter 4 numbers and i will find the max: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

        }
        int max = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("The max is " + max + "\n");
    }



    //Sum of Even Numbers: Given an array of integers, write a Java program that calculates the sum of all even numbers in the array using a for-each loop.
// You can hardcode the array or take input from the user.
    public void sumOfEvenNumbers() {
        int[] arrayy = new int[4];
        System.out.println("Enter 4 numbers to sum the even ones: ");

        for (int i = 0; i < arrayy.length; i++) {
            arrayy[i] = sc.nextInt();

        }
        int sum = sumOfEvenNo(arrayy);
        System.out.println("The sum of even numbers is " + sum);

    }

    public static int sumOfEvenNo(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;

    }

}

