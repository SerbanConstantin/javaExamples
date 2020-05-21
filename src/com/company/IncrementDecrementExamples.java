package com.company;

import java.util.Scanner;

public class IncrementDecrementExamples {

    public static void main(String[] args) {

        //Write a program that reads four numbers and decrements each of them.
        //The program must output the results in the same order separated by spaces.
        /*Sample Input 1:
          10 11 -2 -3
        Sample Output 1:
        9 10 -3 -4*/

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(a + " " + b + " " + c + " " + d);
        a--;
        b--;
        c--;
        d--;
        System.out.println(a + " " + b + " " + c + " " + d);

        System.out.println();

        int n = 0;
        System.out.print(++n);
        System.out.print(n++);
        System.out.print(n++);



    }
}
