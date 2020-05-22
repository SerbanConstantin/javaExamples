package com.company;

import java.util.Scanner;

public class InputExamples {

    public static void main(String[] args) {

        inverseNumber();
        sumOfDigits();

        Scanner in = new Scanner(System.in);

        String name = in.next();
        int age = in.nextInt();
        String stageOfEducation = in.next();
        int yearsOfExperience = in.nextInt();
        String cuisinePreference = in.next();

        System.out.println("The form for " + name + " is completed. We will contact you if we need a chef that cooks " + cuisinePreference + " dishes." );

    }
    private static void inverseNumber() {

        Scanner in = new Scanner(System.in);
        System.out.print("enter nr: ");
        int a = in.nextInt();
        System.out.print("enter nr2: ");
        int b = in.nextInt();
        int c = a;
        a = b;
        b = c;

//        a = a + b;
//        b = a - b;
//        a = a - b;

        System.out.println(a + " " + b);

    }

    private static void sumOfDigits() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter nr: ");
        int number = scanner.nextInt();
        int last_digit = number % 10;
        int second_digit = (number / 10) % 10;
        int first_digit = number / 100;
        System.out.println(first_digit + second_digit + last_digit);

    }
}
