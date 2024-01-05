// Tae Kim, CSE 114, Section1, Lab8_1, Feb 22, 2023
public class Lab8_1 {
    public static void main(String[] args) {
        double sum = 0;
        double numerator;
        double denominator;
        for (int i = 1; i <= 97; i++) {
            numerator = i;
            denominator = i + 2;
            sum += numerator / denominator;
            i++;
        }
        System.out.println("The summation is " + sum);
    }
}
