// Tae Kim, CSE 114, Section1, Lab11_1, Mar 8, 2023
import java.util.Scanner;
public class BusinessStats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers : ");
        double[] num = new double[10];
        for (int i = 0 ; i < num.length ; i++) {
            num[i] = input.nextDouble();
        }

        System.out.printf("The mean is %.2f", mean(num));
        System.out.printf("\nThe standard deviation is %.5f", deviation(num));

    }

    public static double mean(double[] x) {
        double mean;
        int n = 10;
        double sum = 0;
        for (int j = 0 ; j < n ; j++) {
            sum += x[j];
        }
        mean = sum / n;
        return mean;
    }

    public static double deviation(double[] x) {
        double standardDeviation;
        double average = mean(x);
        int n = 10;
        double sum2 = 0;
        for (int a = 0 ; a < n ; a++) {
            sum2 += Math.pow(x[a] - average, 2);
        }
        standardDeviation = Math.sqrt(sum2 / (n - 1));
        return standardDeviation;
    }
}
