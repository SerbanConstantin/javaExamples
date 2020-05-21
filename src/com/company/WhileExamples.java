package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class WhileExamples {
    public static void main(String[] args) {
        //printLetters();
        //sumElem();
        //calculateResult();
        //alMaxNumDivBy();
        //findLargestNum();
        //sumFirstNumbers();
        sumElements();
    }

    private static void printLetters() {
        char letter = 'A';
        while (letter <= 'Z') {
            System.out.print(letter + " ");
            letter++;
        }

    }

    private static void sumElem() {

        //code that calculates the sum of all elements from the given numbers:

        Scanner scanner = new Scanner(System.in);
        //AFTER U ENTER ALL THE NUMBERS PRES CTR+D

        int sum = 0;
        while (scanner.hasNext()) {
            int elem = scanner.nextInt();
            sum += elem;
        }

        System.out.println(sum);
    }

    private static void calculateResult() {

        int i = 0;
        while (i < 10) {
            i++;
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void calMaxNumDivBy() {

        /*Given a sequence of natural numbers, not exceeding 30000.
        Find the maximum element divisible by 4.
        As input, the program gets the number of elements in the sequence, and then the elements themselves.
        In the sequence, there is always an element divisible by 4. The number of elements does not exceed 1000.
        The program should print a single number: the maximum element of the sequence divisible by 4.*/

        Scanner scanner = new Scanner(System.in);
        int res = Integer.MIN_VALUE;
        int n = scanner.nextInt();
        int[] elements = new int[n];

        for (int i = 0; i < n; i++) {
            elements[i] = scanner.nextInt();

        }
        System.out.println(Arrays.toString(elements));

        for (int element : elements) {
            while (element % 4 == 0) {

            }
            res = Math.max(res, element);
        }
        System.out.println(res);


    }

    private static void findLargestNum() {

        /*Given the sequence of integer numbers (which ends with the number 0). Find the largest element of the sequence.
          The number 0 itself is not included in the sequence but serves only as a sign of the sequence’s end.*/

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int max = number;

        while (number != 0) {
            if (max < number) {
                max = number;
            }
            number = scanner.nextInt();
        }
        System.out.println(max);
    }

    public static void sumFirstNumbers() {

        int x, i = 1;
        int sum = 0;
        System.out.println("Enter Number of items :");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        while (i <= x) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of " + x + " numbers is :" + sum);
    }

    private static void sumElements() {

        /*Find the sum of all elements of a sequence, ending with the number 0.
        The number 0 itself is not included into the sequence and serves as a sign of cessation.*/

//        int n,sum=0,i=0;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter how many numbers you want sum");
//        n=sc.nextInt();
//        int a[]=new int[n];
//        System.out.println("Enter the "+n+" numbers ");
//        while(i<n)
//        {
//            System.out.println("Enter  number  "+(i+1)+":");
//            a[i]=sc.nextInt();
//            sum+=a[i];
//            i++;
//        }
//        System.out.println("sum is ="+sum);


        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        while (number != 0) {
            sum += number;

            number = scanner.nextInt();
        }
        System.out.println(sum);


    }
}