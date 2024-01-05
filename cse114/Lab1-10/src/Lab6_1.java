// Tae Kim, CSE 114, Section1, Lab6_1, Feb 15, 2023
import java.util.Scanner;
public class Lab6_1 {
    public static void main(String[] args) {

        // Prompt the user to enter
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter membership (Diamond/Platinum/Regular): ");
        String membership = input.next();
        membership = membership.toLowerCase(); // 중요!
        System.out.print("Please enter ticket price: ");
        int price = input.nextInt();
        System.out.print("Please enter current points: ");
        int points = input.nextInt();

        // Compute and display
        if ((membership.equals("diamond") || membership.equals("platinum")) && price >= 5000)
            System.out.println(35 + points);
        else if (membership.equals("diamond") && price >= 2000 && points >= 300)
            System.out.println(30 + points);
        else if (membership.equals("platinum") && price >= 2000)
            System.out.println(20 + points);
        else if (membership.equals("diamond") && price >= 500 && points >= 100)
            System.out.println(10 + points);
        else if (membership.equals("regular") && price >= 5000 && points >= 100)
            System.out.println(5 + points);
        else if (membership.equals("diamond") && points >= 25)
            System.out.println(2 + points);
        else
            System.out.println(points);
    }
}