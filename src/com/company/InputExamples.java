package com.company;

import java.util.Scanner;

public class InputExamples {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        String name = in.next();
        int age = in.nextInt();
        String stageOfEducation = in.next();
        int yearsOfExperience = in.nextInt();
        String cuisinePreference = in.next();

        System.out.println("The form for " + name + " is completed. We will contact you if we need a chef that cooks " + cuisinePreference + " dishes." );

    }
}
