package Homework1.src;// Tae Kim, 115331743, problem 3

import java.util.Scanner;

public class CarFuelConsumption {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter minutes, mph, and mpg
        System.out.print("Input the number of minutes a car is driven on a long track: ");
        double minutes = input.nextFloat();
        System.out.print("Input the constant speed of the car in miles per hour: ");
        double mph = input.nextFloat();
        System.out.print("Input the fuel efficiency of the car in miles per gallon: ");
        double mpg = input.nextFloat();

        // Compute the number of gallons of gasoline consumed by a car driven down a long track over the given time period.
        double gallonsOfGasoline = minutes / 60 * mph * 1 / mpg;

        // Display the result
        System.out.println(gallonsOfGasoline);
    }
}
// Use floating-point division only. == 1.float 2.double -> integer 가 아닌 그냥 소수점을 쓰라는 말임.