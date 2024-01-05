// Tae Kim, CSE 114, Section1, Lab5_3, Feb 13, 2023
import java.util.Scanner;
public class Lab5_3 {
    public static void main(String[] args) {
        // Prompt the user to enter
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter in the premium price of the auto insurance policy: ");
        float premium = input.nextFloat();
        System.out.print("Please enter in the person's age: ");
        int age = input.nextInt();
        System.out.print("Please enter in either Male or Female for gender: ");
        String gender = input.next(); // 중요!
        gender = gender.toLowerCase();

        // Compute and display
        if ((age >= 18 && age < 21) && gender.equals("male"))
            System.out.println(premium);
        else if ((age >= 18 && age < 21) && gender.equals("female")) // 중요!
            System.out.println(premium * 90.0 / 100);
        else if (age >= 21 && age < 30)
            System.out.println(premium * 75.0 / 100);
        else if ((age >= 30 && age < 60) && gender.equals("male"))
            System.out.println(premium * 60.0 / 100);
        else if ((age >= 30 && age < 60) && gender.equals("female"))
            System.out.println(premium * 70.0 / 100);
        else if (age >= 60)
            System.out.println(premium);
        else
            System.out.println("-1.0");
    }
}