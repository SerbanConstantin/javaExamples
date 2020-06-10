package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class StringExamples {

    public static void main(String[] args) {
//        replaceLetters();
//        substringEx();
//        compareString();
//        prefixEx();
//        endsEx();
//        encrypted();
        //stringToArray();
        //forString();
        //forEachString();
        ex();
    }

    private static void replaceLetters() {

        //Write a program that reads a string and replaces all occurrences of the letter 'a' with the letter 'b'.
        //The program should print out the resulting string.

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str.replace("a", "b"));
    }

    private static void substringEx() {

        // Write a program that reads a string and two integer numbers.
        // These two numbers are representing a range that includes them both.
        // Print the substring enclosed in this range. Both numbers are always greater than or equal to 0 and less than the string length.

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(str.substring(a, ++b));
    }

    private static void compareString() {

        // Write a program that reads two lines and compares them without whitespaces.
        // The program should prints true if both lines are equal, otherwise – false.

        Scanner scanner = new Scanner(System.in);
        String txt1 = scanner.nextLine();
        String txt2 = scanner.nextLine();
        System.out.println(txt1.replace(" ", "").equals(txt2.replace(" ", "")));
    }

    private static void prefixEx() {

        //Write a program that checks if a given string starts with the prefix "J" ignoring the case.
        //The program should output true or false.

        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        System.out.println(text.startsWith("J") || text.startsWith("j"));
        System.out.println(text.charAt(0) == 'J' || text.charAt(0) == 'j');
    }

    private static void endsEx() {

        //Write a program that reads the name of a city and checks if the name ends with "burg".
        //Keep in mind, a city can have a short name.
        //The program should output true or false.

        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        System.out.println(city.endsWith("burg"));
    }

    private static void encrypted() {

        /*To encrypt the message, replace each letter with the letter that is in the corresponding position
        from the end of the English alphabet (a→z, b→y, c→x, ... x→c, y →b, z→a).
        Do not replace spaces or the exclamation mark.
        Use the given template to your program to print the ciphertext instead of the original message.
        The output should look like ## ##### # ########! where # is a lower-case English letter.*/

        String text = "we found a treasure!";
        //System.out.println(text);
        String text1 = text.replace("w", "D").replace("e", "V").replace("f", "U")
                .replace("o", "L").replace("u", "F").replace("n", "M")
                .replace("d", "W").replace("a", "Z").replace("t", "G")
                .replace("r", "I").replace("s", "H");

        System.out.println(text1.toLowerCase());
        System.out.println(text.replaceAll("[a-z]", "#"));
        System.out.println(text.length());


    }

    private static void stringToArray() {

        String text = "Hello";
        String[] parts = text.split(""); // {"H", "e", "l", "l", "o"}
        System.out.println(Arrays.toString(parts));

        String sentence = "a long text";
        String[] words = sentence.split(" "); // {"a", "long", "text"}
        System.out.println(Arrays.toString(words));

        String number = "+1-213-345-6789";
        String[] numberParts = number.split("-"); // {"+1", "213", "345", "6789"}
        System.out.println(Arrays.toString(numberParts));

        String txt = "That's one small step for a man, one giant leap for mankind.";
        String[] txtParts = text.split(","); // {"That's one small step for a man", " one giant leap for mankind."}
        System.out.println(Arrays.toString(txtParts));

        String string = "I'm gonna be a programmer";
        String[] strings = text.split(" gonna be "); // {"I'm", "a programmer"}
        System.out.println(Arrays.toString(strings));
    }

    private static void forString() {

        String scientistName = "Isaac Newton";

        for (int i = 0; i < scientistName.length(); i++) {
            System.out.print(scientistName.charAt(i) + " "); // print the current character
        }

    }

    private static void forEachString() {

        String str = "strings are not primitive types!";

        int count = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                count++;
            }
        }

        System.out.println(count); // 4
    }

    private static void ex() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        String[] words = string.split(" ");
        System.out.println(Arrays.toString(words));

        for (String word : words) {

        }

    }

}
