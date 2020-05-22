package com.company;

import java.util.Scanner;

public class IfExamples {
    public static void main(String[] args) {
//        leapOrRegularYear();
//        intervalNum();
//        chocolateIf();
//        triangleIf();
//        pozOrNegNum();
        evenOrOddNum();

    }

    private static void evenOrOddNum() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input value: ");
        int value = scanner.nextInt();

        if (value % 2 == 0) {
            System.out.println("even nr");
        } else {
            System.out.println("odd nr");
        }
    }

    private static void pozOrNegNum() {

        // Write a program that reads the number and prints YES if it is positive. Otherwise, the program should print NO.
        // Do not forget that zero is not a positive number.

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static void triangleIf() {

        //Given three natural numbers A, B, C. Determine if a triangle with these sides can exist.
        //If the triangle exists, output the YES string, and otherwise, output NO.
        //A triangle is valid if the sum of its two sides is greater than the third side.
        // If three sides are A, B and C, then three conditions should be met.

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (A + B > C && A + C > B && B + C > A) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static void chocolateIf() {

        /*Now think of chocolate as an N x M rectangle divided into little segments: N segments in length and M in width.
       Find out whether it is possible to break off exactly K segments from the chocolate with a single straight line:
       vertical or horizontal.
       Each segment is 1x1.
       Input data format
       The program gets an input of three integers: N, M, K.
       Output data format
       The program must output one of the two words: YES or NO.*/

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        if ((k <= m * n) && (k % n == 0 || k % m == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static void intervalNum() {

        //Given an integer as input. Output True if its value is within the interval (−15,12]∪(14,17)∪[19,+∞),
        // and False otherwise (case sensitive).
        //Here are two types of brackets in the intervals:
        //parenthesis () exclude the border number;
        //and square brackets [] include the border number.

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if ((-15 < number && number <= 12) || (14 < number && number < 17) || (19 <= number)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static void leapOrRegularYear() {

        /*Find whether the given year is a leap year.
        Just a reminder: leap years are those years in which the year’s number is either
         divisible by 4, but not divisible by 100, or divisible by 400
         (for example, the year 2000 is a leap year, but the year 2100 will not be a leap year).
        The program should work correctly for the years 1900 ≤ n ≤ 3000.
        Output "Leap" (case-sensitive) if the given year is a leap year, and "Regular" otherwise.
         It is enough to write a simple conditional statement to solve this task.*/

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}
