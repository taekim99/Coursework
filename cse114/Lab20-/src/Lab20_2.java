// Tae Kim, CSE 114, Section1, Lab20_2, April 19, 2023
import java.util.ArrayList;
import java.util.Scanner;
public class Lab20_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many values are in the array list: ");
        int n = input.nextInt();
        System.out.print("Enter the grades: ");
        ArrayList<Integer> intArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            intArray.add(input.nextInt());
        }

        ArrayList<Character> charArray = toCharacter(intArray, n);
        System.out.println("The letter grades are: " + charArray);
    }
    public static ArrayList<Character> toCharacter(ArrayList<Integer> intArray, int n) {
        ArrayList<Character> charArray = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (intArray.get(i) >= 90)
                charArray.add('A');
            else if (intArray.get(i) >= 80)
                charArray.add('B');
            else if (intArray.get(i) >= 70)
                charArray.add('C');
            else if (intArray.get(i) >= 60)
                charArray.add('D');
            else
                charArray.add('F');
        }
        return charArray;
    }
}