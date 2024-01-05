package Homework1.src;// Tae Kim, 115331743, problem 2

import java.util.Scanner;

public class ShowMeTheMoney {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of farthings
        System.out.print("Enter in the number of farthings: ");
        int farthings = input.nextInt();

        // calculate staring, shilling, penny, and farthings
        int getFarthings = farthings % 4;
        int penny = farthings / 4;
        int getPenny = penny % 12;
        int shilling = penny / 12;
        int getShilling = shilling % 20;
        int sterling = shilling / 20;

        // Display the results
        System.out.println("Sterling " + sterling);
        System.out.println("Shilling " + getShilling);
        System.out.println("Penny " + getPenny);
        System.out.println("Farthings " + getFarthings);
    }
}