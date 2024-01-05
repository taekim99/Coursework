// Tae Kim, CSE 114, Section1, Lab8_2, Feb 22, 2023
import java.util.Scanner;
public class Lab8_2 {
    public static void main(String[] args) {
        // Prompt the user to enter date
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the date: ");
        String date = input.next();

        // Convert the format
        String month = date.substring(0, 2);
        String date1 = date.substring(3, 5);
        String year = date.substring(6);
        int monthInNum = Integer.parseInt(month);

        /* switch (month) {
            case "01": System.out.println("January " + date1 + "," + year); break;
        }
        */

        // Display
        switch (monthInNum) {
            case 1 : System.out.println("January " + date1 + "," + year); break;
            case 2 : System.out.println("February " + date1 + "," + year); break;
            case 3 : System.out.println("March " + date1 + "," + year); break;
            case 4 : System.out.println("April " + date1 + "," + year); break;
            case 5 : System.out.println("May " + date1 + "," + year); break;
            case 6 : System.out.println("June " + date1 + "," + year); break;
            case 7 : System.out.println("July " + date1 + "," + year); break;
            case 8 : System.out.println("August " + date1 + "," + year); break;
            case 9 : System.out.println("September " + date1 + "," + year); break;
            case 10 : System.out.println("October " + date1 + "," + year); break;
            case 11 : System.out.println("November " + date1 + "," + year); break;
            case 12 : System.out.println("December " + date1 + "," + year); break;
        }
    }
}
