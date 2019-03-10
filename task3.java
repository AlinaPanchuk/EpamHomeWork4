package com.epam.task3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer number - >  ");
        int number = sc.nextInt();
        System.out.println(twoLastReversDigits(number));
    }

    public static String twoLastReversDigits(int number) {
        if (number > 9) {
            String line = "";
            final int HUNDRED = 100;
            final int TEN = 10;
            int valueOfHundred = (number % HUNDRED) / TEN;
            int valueOfUnits = number % TEN;
            line = line + valueOfUnits + valueOfHundred;
            return line;
        } else{
            System.out.println("Number < 9. The programme can not reverse it ");
        }
        return null;
    }
}
