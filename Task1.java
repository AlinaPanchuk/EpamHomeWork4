package com.epam.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a String -> ");
        String inputLine = sc.nextLine();
        System.out.println(findUniqueSymbols(inputLine));
    }

    public static String findUniqueSymbols(String line) {
        if (checkString(line)) {
            String result = "";
            int length = line.length();
            int index = 0;
            while (index < length) {
                char ch = line.charAt(index);
                if (!result.contains(String.valueOf(ch))) {
                    result += ch;
                }
                index++;
            }
            return result;
        }
        return null;
    }

    public static boolean checkString(String line) {
        return line != null && line.length() != 0
                && line.trim().length() != 0;
    }
}
