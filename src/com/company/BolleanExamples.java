package com.company;

import java.util.Scanner;

public class BolleanExamples {
    public static void main(String[] args) {
        lessAnInterval();
        sumPair();
        numBetween();
    }

    private static void lessAnInterval() {
        //Write a program that reads an integer value and checks if it is less than 10 and greater than 0.

        Scanner in = new Scanner(System.in);
        System.out.println("Enter nr: ");
        int nr = in.nextInt();
        boolean result = nr < 10 && nr > 0;
        System.out.println(result);
    }

    private static void sumPair() {

        //Write a program that reads the numbers a, b, c and checks if any pair of them sums to 20.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println((a + b) == 20 || (a + c) == 20 || (b + c) == 20);
    }

    private static void numBetween() {


        //Write a program that reads three integer numbers and prints true if the first number
        // is between the second and the third one (inclusive). Otherwise, it must print false.

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a >= b && a <= c || a <= b && a >= c);

//       num1 >= num2 && num1 <= num3 || num1 <= num2 && num1 >= num3
    }

}

