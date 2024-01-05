// Tae Kim, CSE 114, Section1, Lab7_3, Feb 20, 2023
import java.util.Scanner;
public class Lab7_3 {
    public static void main(String[] args){
        // Prompt the user to enter his or her weapon
        Scanner input = new Scanner(System.in);
        System.out.print("Choose your weapon: ");
        String userWeapon = input.next();

        // user weapon
        int user;
        if (userWeapon.equals("rock") || userWeapon.equals("scissors") || userWeapon.equals("paper"))
            user = 1;
        else {
            System.out.println("The input is invalid");
            return;
        }

        // Let the computer choose its weapon
        int comp = (int)(Math.random() * 3);

        // Compare
        System.out.println("The user(you) chose " + userWeapon);

        if (userWeapon.equals("rock")){
            if (comp > user){
                System.out.println("The comp chose paper");
                System.out.println("You lose!");
            } else if (comp < user){
                System.out.println("The comp chose scissor");
                System.out.println("You won!");
            } else {
                System.out.println("The comp chose rock");
                System.out.println("You tied!");
            }
        } else if (userWeapon.equals("paper")) {
            if (comp > user){
                System.out.println("The comp chose  scissor");
                System.out.println("You lose!");
            } else if (comp < user){
                System.out.println("The comp chose  rock");
                System.out.println("You won!");
            } else {
                System.out.println("The comp chose  paper");
                System.out.println("You tied!");
            }
        } else if (userWeapon.equals("scissors")) {
            if (comp > user){
                System.out.println("The comp chose rock");
                System.out.println("You lose!");
            } else if (comp < user){
                System.out.println("The comp chose paper");
                System.out.println("You won!");
            } else {
                System.out.println("The comp chose scissors");
                System.out.println("You tied!");
            }
        }
    }
}
