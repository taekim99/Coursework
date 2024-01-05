// Tae Kim, CSE 114, Section1, Lab11_2, Mar 8, 2023
import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        for (int i = 0 ; i < num.length ; i++) {
            num[i] = input.nextInt();
        }

        int[] arr = reverse(num);

        System.out.println("The reverse array is " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // 1 2 3 4 5 6 7 8 9 10
    public static int[] reverse(int[] n) {
        for (int j = 0 ; j < n.length / 2; j++) {
            int temp = n[j];//save value
            n[j] = n[n.length - j - 1]; //set first half
            n[n.length - j - 1] = temp; //set second half
        }
        return n;
    }
}
