package Homework1.src;// Tae Kim, 115331743, problem 6

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter temp
        System.out.print("Enter a temperature between -58F and 41F: ");
        int temperature = input.nextInt();

        while (temperature < -58 || temperature > 41) {
            System.out.print("Enter a right temperature: ");
            temperature = input.nextInt();
        }


        System.out.print("Enter a wind speed greater than or equal to 2: ");
        int windSpeed = input.nextInt();

        while (windSpeed < 2) {
            System.out.print("Enter a right wind speed: ");
            windSpeed = input.nextInt();
        }

        // calculate wind-chill temp
        double windChillTemperature = 35.74 + (0.621) * temperature - (35.75) * Math.pow(windSpeed, 0.16)
                + 0.4475 * temperature * Math.pow(windSpeed, 0.16);

        // Display the result
        System.out.printf("%s%.2f", "The wind-chill temperature is ", windChillTemperature);
    }
}