// Tae Kim, CSE 114, Section1, Lab24_2, May 3, 2023
import java.util.Scanner;
public class Lab24_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        System.out.println(sumDigits(n));
    }
    public static int sumDigits(int n) {
//        int sum = 0;
//        if (n < 10)
//            sum += n;
//        else {
//            sum += n % 10;
//            sum += sumDigits(n / 10);
//        }
//        return sum;

        //n = 234
        //4 + ( 3 + 2 )
        //sumDigits(23) = 3 + 2
        //sumDigits(2) = 2
        if(n < 10){
            return n;
        }else{
            return n%10 + sumDigits(n/10);
        }
    }
}
