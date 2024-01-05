package Homework3.src;

// Tae Kim, 115331743, problem 2
public class Emirp {
    public static void main(String[] args) {
        int count = 0;
        int n = 13; // start from the smallest 2 decimal number
        while (count < 100) {
            if (isPrime(n) && isPrime(reverse(n)) && INP(n)) {
                System.out.print(n + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            n++;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reverse(int n) {
        int r = 0;
        while (n > 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }
        return r;
    }

    public static boolean INP(int n) {
        return n != reverse(n);
    }
}