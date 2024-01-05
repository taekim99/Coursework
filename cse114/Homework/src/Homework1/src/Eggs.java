package Homework1.src;// Tae Kim, 115331743, problem 5

import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of eggs
        System.out.print("Enter the number of eggs: ");
        int numberOfEggs = input.nextInt();

        // Calculate dozens and loose eggs
        int dozenOfEggs = numberOfEggs / 12;
        double priceOfDozenOfEggs = dozenOfEggs * 325;

        int looseEggs = numberOfEggs % 12;
        double priceOfLooseEggs = looseEggs * 45;

        double total = (priceOfDozenOfEggs + priceOfLooseEggs) / 100.0;


        // Display the result
        System.out.println("You ordered " + numberOfEggs + " eggs. That's " + dozenOfEggs
                + " dozen at 3.25$ per dozen and " + looseEggs + " loose eggs at 45 cents for a total of $" + total);
    }
}