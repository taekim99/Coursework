package Homework4.src;

// Tae Kim, 115331743, problem 1
public class ArrayUtils {
    public static void main(String[] args) {

        // a.
        int[] mainArr = ArrayUtils.randomArray(100, 21);

        // b.
        ArrayUtils.print(mainArr);

        // c.
        int sum = ArrayUtils.arraySum(mainArr);
        double avg = (double) sum / mainArr.length;
        System.out.println("The average: " + avg);

        // d.
        int index = ArrayUtils.contains(mainArr, 12);
        System.out.println("The index of the first occurrence of 12: " + index);

        // e.
        int count = ArrayUtils.countMultiplesOf(mainArr, 7);
        System.out.println("The count of multiples of 7: " + count);
    }

    public static int[] randomArray(int size, int upperLimit) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * (upperLimit + 1));
        }
        return arr;
    }

    public static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("]");
    }

    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static int countMultiplesOf(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isMultipleOf(arr[i], num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isMultipleOf(int num, int factor) {
        return (factor != 0) && (num % factor == 0);
    }
}
