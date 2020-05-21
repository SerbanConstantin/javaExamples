package com.company;

import sun.font.DelegatingShape;

import java.util.Arrays;
import java.util.Scanner;

public class ForExamples {

    public static void main(String[] args) {

        avgNumbers();
        maxNumDiv();
        grades();
        multiTable();
        sumInteger();
        outputArray();
        productNumber();
        sumOfInts();
        numDivBy();
        fizzBuzz();
        detectorParts();
        countNumDivBy();


    }

    private static void outputArray() {

        for (int i = 0; i <= 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void sumInteger() {

        //Let's calculate the sum of the integer numbers from 1 to 10 (inclusive) using the for-loop.

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);


        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void multiTable() {

        //The following code prints the multiplication table of numbers from 1 to 9 (inclusive).

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

    }

    private static void grades() {

        /*Find the number of D, C, B and A grades for the last test on informatics,
        where n students from a class have successfully passed the test.
         In this task, we use a 5-point grading system and are interested only in passing grades:
         from 2 to 5. They correspond to the letter grades in the following way: 5 is for A, 4 is for B, 3 is for C and 2 is for D.
          The program gets number n as input and then gets the grades themselves: one by one
            The program should output four numbers in a single line: the number of D, C, B, and A grades respectively.
         */

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (array[i] == 2) {
                countD++;
            } else if (array[i] == 3) {
                countC++;
            } else if (array[i] == 4) {
                countB++;
            } else if (array[i] == 5) {
                countA++;
            }
        }

        System.out.println("\n" + countD + " " + countC + " " + countB + " " + countA);
    }

    private static void maxNumDiv() {

        /*Given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4.
        There is always an element divisible by 4 in the sequence and the number of elements does not exceed 1000.
        As input, the program receives the number of elements in the sequence m (first line)
        and then the elements themselves (next m lines).
        The program should print a single number: the maximum element of the sequence divisible by 4.*/

        Scanner scanner = new Scanner(System.in);

        int res = Integer.MIN_VALUE;
        int m = scanner.nextInt();
        int[] arrayOfNumbers = new int[m];

        for (int i = 0; i < m; i++) {
            arrayOfNumbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arrayOfNumbers));

        for (int arrayOfNumber : arrayOfNumbers) {
            if (arrayOfNumber % 4 == 0) {
                res = Math.max(res, arrayOfNumber);
            }
        }
        System.out.println(res);
    }


    private static void avgNumbers() {

        /*Write a program that reads two numbers a and b from the keyboard and calculates and outputs
        to the console the arithmetic average of all numbers from the interval [a;b], which are divisible by 3.
        In the example below, the arithmetic average is calculated for the numbers on the interval [-5; 12].
        Total numbers divisible by 3 on this interval 6: -3, 0, 3, 6, 9, 12. Their arithmetic average equals to 4.5
        The program input contains intervals, which always contain at least one number, which is divisible by 3.*/

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double count = 0.0;
        double sum = 0.0;

        for (double i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println(sum / count);
    }

    private static void productNumber() {

       /* Write a program that prints the product of all integer numbers from a to b (a < b).
         Include a and exclude b from the product.*/

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long products = 1;

        for (long i = a; i < b; i++) {
            products *= i;
        }
        System.out.println(products);
    }

    private static void sumOfInts() {

        /*Print the sum of all integers from a to b including both.
        It is guaranteed that a < b in all test cases.*/

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int sum = 0;

        for (int i = x; i <= y; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    private static void numDivBy() {

        /*Given the sequence of natural numbers. Find the sum of numbers divisible by 6.
        The input is the number of elements in the sequence, and then the elements themselves.
        In this sequence, there is always a number divisible by 6.*/

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n = scanner.nextInt();
        int[] numbersArray = new int[n];

        for (int i = 0; i < n; i++) {
            numbersArray[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbersArray));

        for (int numbersArrays : numbersArray) {
            if (numbersArrays % 6 == 0) {
                sum += numbersArrays;
            }
        }
        System.out.println(sum);
    }

    private static void fizzBuzz() {

        /*Write a program that takes the input of two integers: the beginning and the end of the interval
        (both numbers belong to the interval).
        The program should output the numbers from this interval, but if the number is divisible by 3,
         you should output Fizz instead of it; if the number is divisible by 5, output Buzz;
         and if it is divisible both by 3 and by 5, output FizzBuzz.*/

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else {
                System.out.println(i);
            }
        }
    }

    private static void detectorParts() {

    /*A detector compares the size of parts produced by a machine with the reference standard.
    If the size of the part is larger, it can be sent to be fixed, and the detector prints the number 1.
    If the size of the part is smaller, it is removed as a reject, and the detector prints the number -1.
    If the part is perfect, it is sent to the box with products, that are ready to ship, and the detector prints 0.
    Write a program, which takes the number of parts n as input, and then the sequence of detector prints.
    The program should output numbers in a single line containing the number of parts ready to be shipped,
    the number of parts to be fixed, and the number of rejects.*/

        Scanner scanner = new Scanner(System.in);
        int sumReady = 0;
        int sumFixed = 0;
        int sumRejects = 0;

        int n = scanner.nextInt();
        int[] parts = new int[n];

        for (int i = 0; i < n; i++) {
            parts[i] = scanner.nextInt();
        }
        //System.out.println(Arrays.toString(parts));
        for (int part : parts) {
            if (part == 0) {
                sumReady++;
            } else if (part == 1) {
                sumFixed++;
            } else if (part == -1) {
                sumRejects++;
            }

        }
        System.out.print(sumReady + " " + sumFixed + " " + sumRejects);
    }

    private static void countNumDivBy() {

        /*Write a program that reads a, b, n and outputs the count of numbers divisible by n in the range from a to b (a < b) inclusively.
           Note:  it is possible to write this program more efficiently without any loops.*/

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int count = 0;

        for (int i = a; i <= b; i++) {
                if (i % n == 0) {
                    count++;
                }
            }
        System.out.println(count);

    }

}

