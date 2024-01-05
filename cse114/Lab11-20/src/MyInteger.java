// Tae Kim, CSE 114, Section1, Lab18_2_1, April 10, 2023
public class MyInteger {
    public int value;
    public MyInteger(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public boolean isEven() {
        if (value == 0 || value % 2 == 0)
            return true;
        else
            return false;
    }
    public boolean isOdd() {
        if (value % 2 != 0)
            return true;
        else
            return false;
    }
    public boolean isPrime() {
        boolean isPrime = true;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static boolean isEven(MyInteger n) {
        if (n.getValue() == 0 || n.getValue() % 2 == 0)
            return true;
        else
            return false;
    }
    public static boolean isOdd(MyInteger n) {
        if (n.getValue() % 2 != 0)
            return true;
        else
            return false;
    }
    public static boolean isPrime(MyInteger n) {
        boolean isPrime = true;
        for (int i = 2; i < n.getValue(); i++) {
            if (n.getValue() % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public boolean equals(int n) {
        if (value == n) // a.equals(4)
            return true;
        else
            return false;
    }
    public boolean equals(MyInteger n) {
        if (value == n.getValue())
            return true;
        else
            return false;
    }
}
