// Tae Kim, CSE 114, Section1, Lab13_1, Mar 22, 2023
import java.util.Scanner;
import java.util.Arrays;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] tTT = new String[3][3];
        for (int row = 0; row < tTT.length; row++) {
            for (int col = 0; col < tTT[row].length; col++) {
                tTT[row][col] = "-";
            }
        }

        for (int i = 1; i < 10; i++) {

            for (int row = 0; row < tTT.length; row++) {
                String total = "";
                for (int col = 0; col < tTT[row].length; col++) {
                    total += tTT[row][col];
                }
                if (total.equals("XXX")) {
                    System.out.println("first player won");
                    System.exit(0);
                } if (total.equals("OOO")) {
                    System.out.println("second player won");
                    System.exit(0);
                }
            }
            for (int col = 0; col < tTT[0].length; col++) {
                String total = "";
                for (int row = 0; row < tTT.length; row++) {
                     total += tTT[row][col];
                }
                if (total.equals("XXX")) {
                    System.out.println("first player won");
                    System.exit(0);
                } if (total.equals("OOO")) {
                    System.out.println("second player won");
                    System.exit(0);
                }
            }

            String total = "";
            for (int j = 0; j < tTT.length; j++) {
                total += tTT[j][j];
            }
            if (total.equals("XXX")) {
                System.out.println("first player won");
                System.exit(0);
            } if (total.equals("OOO")) {
                System.out.println("second player won");
                System.exit(0);
            }

            String total2 = "";
            for (int j = 0; j < tTT.length; j++) {
                total2 += tTT[j][2 - j];
            }
            if (total2.equals("XXX")) {
                System.out.println("first player won");
                System.exit(0);
            } if (total2.equals("OOO")) {
                System.out.println("second player won");
                System.exit(0);
            }

            if (i % 2 != 0) {
                System.out.print("Player one: ");
                int y = input.nextInt() - 1;
                int x = input.nextInt() - 1;
                System.out.println("unfinished");
                firstPlayer(y, x, tTT);
            } else {
                System.out.print("Player two: ");
                int y = input.nextInt() - 1;
                int x = input.nextInt() - 1;
                System.out.println("unfinished");
                secondPlayer(y,x, tTT);
            }
        }
    }

    public static void firstPlayer(int y, int x, String[][] tTT) {
        tTT[y][x] = "X";
        for (int row = 0; row < tTT.length; row++) {
            for (int col = 0; col < tTT[row].length; col++) {
                System.out.print(tTT[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void secondPlayer(int y, int x, String[][] tTT) {
        tTT[y][x] = "O";
        for (int row = 0; row < tTT.length; row++) {
            for (int col = 0; col < tTT[row].length; col++) {
                System.out.print(tTT[row][col] + " ");
            }
            System.out.println();
        }
    }


    // String[][] tTT ==
    /*
    * Scanner
    * for 9 - user (% 2 == 0)
    * 2 public static void method
    *
    *
    *
    * */

}
