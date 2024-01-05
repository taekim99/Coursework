// Tae Kim, CSE 114, Section1, Lab8_3, Feb 22, 2023
import java.util.Scanner;
public class Lab8_3 {
    public static void main(String[] args) {
        // Prompt the user to enter a verb
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a verb: ");
        String verb = input.next();

        // Convert
        int length = verb.length();
        String startVerb = verb.substring(0, length - 1);
        String endVerb = verb.substring(length - 1);
        String endVerb2 = verb.substring(length - 2);
        // Display
        if (endVerb.equals("y")) {
            System.out.println(startVerb + "ies");
        } else if (endVerb.equals("o") || endVerb.equals("s") || endVerb.equals("x")
                || endVerb2.equals("ch") || endVerb2.equals("sh")) {
            System.out.println(verb + "es");
        } else
            System.out.println(verb + "s");
    }
}
