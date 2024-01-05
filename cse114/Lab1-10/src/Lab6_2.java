// Tae Kim, CSE 114, Section1, Lab6_2, Feb 15, 2023
public class Lab6_2 {
    public static void main(String[] args) {
        // generate 10 random integers in the range from 0 to 100 (excluding 100)
        int sum = 0;
        int x;
        for (int i = 0; i < 10; i++) {
            x = (int) (Math.random() * 100);
            System.out.print(x + " ");
            sum += x;
        }

        // compute the average value of these 10 random integers. Please use a double variable for computing the average value.
        double average = (int) sum / 10.0;
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);

    }
}