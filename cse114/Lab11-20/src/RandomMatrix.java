// Tae Kim, CSE 114, Section1, Lab12_3, Mar 20, 2023
public class RandomMatrix {
    public static void main(String[] args) {
        int[][] randomX = new int[8][8];

        for (int row = 0; row < randomX.length; row++) {
            for (int col = 0; col < randomX[row].length; col++) {
                randomX[row][col] = (int)(Math.random() * 2);
                System.out.print(randomX[row][col]);
            }
            System.out.println();
        }

        checkRow(randomX);
        checkCol(randomX);
        checkDia(randomX);
        checkMinDia(randomX);
    }

    public static void checkRow(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            int total = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                total += matrix[row][col];
            }
            if (total == 0) {
                System.out.println("All 0's on the " + row + "row");
                break;
            } if (total == 8) {
                System.out.println("All 1's on the " + row + "row");
                break;
            }
        }
    }

    public static void checkCol(int[][] matrix) {
        for (int col = 0; col < matrix[0].length; col++) {
            int total = 0;
            for (int row = 0; row < matrix.length; row++) {
                total += matrix[row][col];
            }
            if (total == 0) {
                System.out.println("All 0's on the " + col + " column");
                break;
            } if (total == 8) {
                System.out.println("All 1's on the " + col + " column");
                break;
            }
        }
    }

    public static void checkDia(int[][] matrix) {
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
                total += matrix[i][i];
        }

        if (total == 0)
            System.out.println("All 0's major diagonal");
        if (total == 8)
            System.out.println("All 1's major diagonal");
    }
    public static void checkMinDia(int[][] matrix) {
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            total += matrix[i][7 - i];
        }

        if (total == 0)
            System.out.println("All 0's minor diagonal");
        if (total == 8)
            System.out.println("All 1's minor diagonal");
    }
}
