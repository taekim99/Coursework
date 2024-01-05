package Homework1.src;// Tae Kim, 115331743, problem 1

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {

        // Display my name
        System.out.println("Tae Kim");
        // Display my SBU ID
        System.out.println("115331743");
        // Display the weekly schedule
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s", "Time", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday");
        System.out.printf("\n%-20s", "9:00am-10:00am");
        System.out.printf("\n%-20s%-20s", "10:30am-11:25am", "CSE215(REC)");
        System.out.printf("\n%-20s", "11:30am-12:50pm");
        System.out.printf("\n%-20s%-20s%-20s%-20s%-20s%-20s", "1:00pm-2:20pm", "CSE215", "LIN230", "", "LIN230", "CSE215");
        System.out.printf("\n%-20s%-20s%-20s%-20s%-20s%-20s", "2:30pm-3:20pm", "", "POL102", "", "POL102", "");
        System.out.printf("\n%-20s%-20s%-20s%-20s%-20s%-20s", "4:00pm-5:20pm", "", "", "", "", "");
        System.out.printf("\n%-20s%-20s%-20s%-20s%-20s%-20s", "6:05pm-7:25pm", "CSE114", "", "CSE114", "", "");
        System.out.printf("\n%-20s%-20s%-20s%-20s%-20s%-20s", "7:50pm-9:10pm", "CSE114(LAB)", "", "CSE114(LAB)", "", "");
    }
}