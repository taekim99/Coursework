// Tae Kim, CSE 114, Section1, Lab9_3, Feb 27, 2023
public class ComputeSummation {
    public static void main(String[] args) {
        summation(20);
    }

    public static void summation(int n) {
        double sum = 0;
        System.out.println("i           m(i)");

        for (int i = 1 ; i <= 20 ; i++) {
            sum += i / (i + 1.0);
            System.out.printf("%d           %.4f\n", i, sum);
        }
    }
}
