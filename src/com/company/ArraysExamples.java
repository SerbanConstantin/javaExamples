package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExamples {

    public static void main(String[] args) {
        sumOfNumbers();
        createAndOutputArray();
        initCharArray();
        createAndSortArray();
        equalsAndFillArray();


        int arrN[] = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21};
        int n = 6;
        n = arrN[arrN[n] / 2];
        System.out.println(n);

        int arrM[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int m = 6;
        m = arrM[arrM[m]];
        System.out.println(m);

    }

    private static void createAndSortArray() {
        int[] array = new int[4];
        array[0] = 1;
        array[1] = 3;
        array[2] = 4;
        array[3] = 2;
        System.out.println(java.util.Arrays.toString(array));
        java.util.Arrays.sort(array);
        System.out.println(java.util.Arrays.toString(array));
    }
    private static void equalsAndFillArray() {

        int[] arrayInts1 = {1, 3, 5, 7, 9};
        int[] arrayInts2 = {1, 3, 7, 5, 9};
        int[] arrayInts3 = {1, 3, 5, 7, 9};
        System.out.println(java.util.Arrays.equals(arrayInts1, arrayInts2));
        System.out.println(java.util.Arrays.equals(arrayInts1, arrayInts3));

        int size = 10;
        char[] chars = new char[size];
        java.util.Arrays.fill(chars, 0, size / 2, 'a');
        java.util.Arrays.fill(chars, size / 2, size, 'b');
        System.out.println(java.util.Arrays.toString(chars));

        int numbers[] = {1, 2, 3, 4, 5};
        java.util.Arrays.fill(numbers, 1, 5, 10);
        System.out.println(java.util.Arrays.toString(numbers));
    }

    private static void initCharArray() {

        //Create an array of chars named characters with four elements 'a', 'z', 'e', 'd' and output it.

        char[] characters = {'a', 'z', 'e', 'd'};
        System.out.println(java.util.Arrays.toString(characters));
    }


    private static void createAndOutputArray() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
    }

    private static void sumOfNumbers() {

        //This problem was asked by Microsoft.
        // Given an array of numbers and a number k, determine if there are three entries in the array which add up to the specified number k.
        // For example, given [20, 303, 3, 4, 25] and k = 49, return true as 20 + 4 + 25 = 49. (edited)

        int[] arrayOfInts = {1, 4, 45, 6, 10, 8};
        System.out.println(Arrays.toString(arrayOfInts));
        Scanner in = new Scanner(System.in);
        System.out.println("Enter nr: ");
        int sum = in.nextInt();
        boolean isSum = false;
        for (int i = 0; i < arrayOfInts.length - 2; i++) {
            for (int j = i + 1; j < arrayOfInts.length - 1; j++) {
                for (int k = j + 1; k < arrayOfInts.length; k++) {
                    if (arrayOfInts[i] + arrayOfInts[j] + arrayOfInts[k] == sum) {
                        System.out.print("Nr. are " + arrayOfInts[i] + ", " + arrayOfInts[j] + ", " + arrayOfInts[k] + "\n");
                        isSum = true;
                    }
                }
            }
        }
        System.out.println(isSum);


    }
}


