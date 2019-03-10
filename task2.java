package com.epam.task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a integer number -> ");
        int number = sc.nextInt();
        String resultString = convertNumberToString(number);
        String reverseString = reverseStringWithCharAt(resultString);
        System.out.println("String = " + reverseString);
    }

    public static String convertNumberToString(int number) {
        String result = "";
        final int TWO = 2;
        char one = '1';
        char zero = '0';
        while (number > 0) {
            if (number % 2 == 0) {
                result = result + zero;
            } else {
                result = result + one;
            }
            number = number / TWO;
        }
        return result;
    }

    public static String reverseStringWithCharAt(String resultString) {
        int stringLength = resultString.length();
        String result = "";
        int i = 0;
        while (i < stringLength) {
            result = resultString.charAt(i) + result;
            i++;
        }
        return result;
    }

}
