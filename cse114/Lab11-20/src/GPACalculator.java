// Tae Kim, CSE 114, Section1, Lab11_3, Mar 8, 2023
import java.util.Scanner;
public class GPACalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many courses you took: ");
        int n = input.nextInt();

        if (n == 0) {
            System.out.println(-1.0);
            System.exit(1);
        }

        System.out.print("Enter the grades you received: ");
        String[] gradesInput = new String[n];

        for (int i = 0 ; i < n ; i++) {
            gradesInput[i] = input.next().toUpperCase();
        }

        System.out.println(gpaCalculator(gradesInput));

    }

    public static double gpaCalculator(String[] grades) {
        if (grades.length == 0) {
            return -1.0;
        }

        double totalGradePoints = 0.0;
        int totalCredits = 0;

        for (String grade : grades) {
            switch (grade) {
                case "A":
                    totalGradePoints += 4.0;
                    totalCredits += 1;
                    break;
                case "B":
                    totalGradePoints += 3.0;
                    totalCredits += 1;
                    break;
                case "C":
                    totalGradePoints += 2.0;
                    totalCredits += 1;
                    break;
                case "D":
                    totalGradePoints += 1.0;
                    totalCredits += 1;
                    break;
                case "F":
                    totalGradePoints += 0.0;
                    totalCredits += 1;
                    break;
                case "P":
                case "NC":
                    break;
                default:
                    return -1.0;
            }
        }
        if (totalCredits == 0) {
            return 0.0;
        }
        return totalGradePoints / totalCredits;
    }
}