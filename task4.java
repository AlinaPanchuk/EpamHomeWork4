package com.epam.task4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the height of the pyramid - > ");
        int heightOfThePyramid = sc.nextInt();
        outputOfThePyramid(heightOfThePyramid);
    }

    public static void outputOfThePyramid(int heightOfThePyramid){
        int line = 0;
        while (line < heightOfThePyramid + 1){
            int i = 0;
            while (i < heightOfThePyramid-line) {
                System.out.print(" ");
                i++;
            }
            int j = 0;
            while (j < line * 2 + 1) {
                    System.out.print("" + (j + 1));
                    j++;
            }
            System.out.println();
            line++;
        }
    }
}
