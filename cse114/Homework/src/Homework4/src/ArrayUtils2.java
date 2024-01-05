package Homework4.src;

public class ArrayUtils2 {
    public static void main(String[] args) {

        // a.
        int[] mainArr = randomArray(100, 21);

        // b.
        print(mainArr);

        // c.
        double average = (double)(arraySum(mainArr)) / mainArr.length;
        System.out.println("The average: " + average);

        // d.
        System.out.println("The index of the first occurrence of 12: " + contains(mainArr, 12));


        // e.
        System.out.println("Counts of the multiple of 7: " + countMultiplesOf(mainArr, 7));

    }

    public static int[] randomArray(int size, int upperLimit) {
        int[] result = new int[size];
        for (int i = 0 ; i < size ; i++) {
            result[i] = (int)(Math.random() * upperLimit);
        }
        return result;
    }

    public static void print(int[] x) {
        System.out.print("[");
        for (int i = 0 ; i < x.length ; i++) {
            System.out.print(" " + x[i] + " ");
        }
        System.out.println("]");
    }

    public static int arraySum(int[] x) {
        int sum = 0;
        for (int j = 0 ; j < x.length ; j++) {
            sum += x[j];
        }
        return sum;
    }

    public static int contains(int[] x, int n) {
        int index = -1;
        for (int a = 0 ; a < x.length ; a++) {
            if (x[a] == n) {
                index = a;
                break;
            }
        }
        return index;
    }

    public static int countMultiplesOf(int[] x, int n) {
        int count = 0;
        for (int i = 0 ; i < x.length ; i++) {
            if (x[i] % n == 0) {
                count++;
            }
        }
        return count;
    }
}