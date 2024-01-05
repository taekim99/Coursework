// Tae Kim, CSE 114, Section1, Lab24_1, May 3, 2023
import java.util.Scanner;
public class Lab24_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        reverseDisplay(str);
    }
    public static void reverseDisplayFor(String value) {
        for (int i = value.length() - 1; i >= 0; i--) {
            System.out.print(value.charAt(i));
        }
    }
    public static void reverseDisplay(String value) {
        if (value.length() == 1) {
            System.out.print(value);
        } else {
            System.out.print(value.charAt(value.length() - 1));
            reverseDisplay(value.substring(0, value.length() - 1));
        }
    }
}

// first think about the base first

// int - practice final
//   if(n < 10){
//        System.out.print(n);
//    }else{
//        System.out.print(n % 10);
//        reverseDisplay(n/ 10);
//    }