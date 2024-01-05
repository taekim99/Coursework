package Homework4.src;// Tae Kim, 115331743, problem 2
import java.util.Arrays;
public class InterleaveArrays {

    public static int[] interleaveArrays(int[] array1, int[] array2) {
        int len1 = array1.length;
        int len2 = array2.length;
        int[] result = new int[len1 + len2];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < len1 && j < len2) {
            result[k++] = array1[i++];
            result[k++] = array2[j++];
        }
        while (i < len1) {
            result[k++] = array1[i++];
        }
        while (j < len2) {
            result[k++] = array2[j++];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,3,5};
        int[] arr2 = new int[]{2,4,6};
        int[] result1 = interleaveArrays(arr1, arr2);
        System.out.println(Arrays.toString(result1)); // Display [1, 2, 3, 4, 5, 6]

        int[] arr3 = new int[]{10,20,30,40,50,60,70,80};
        int[] arr4 = new int[]{2,4,6,8};
        int[] result2 = interleaveArrays(arr3, arr4);
        System.out.println(Arrays.toString(result2)); // Display [10, 2, 20, 4, 30, 6, 40, 8, 50, 60, 70, 80]

        int[] arr5 = new int[]{1,3,5};
        int[] arr6 = new int[]{2,4,6,8,10};
        int[] result3 = interleaveArrays(arr5, arr6);
        System.out.println(Arrays.toString(result3)); // Display [1, 2, 3, 4, 5, 6, 8, 10]

        int[] arr7 = new int[]{};
        int[] arr8 = new int[]{2,4,6,8};
        int[] result4 = interleaveArrays(arr7, arr8);
        System.out.println(Arrays.toString(result4)); // Display [2, 4, 6, 8]

        int[] arr9 = new int[]{1,3,5};
        int[] arr10 = new int[]{2};
        int[] result5 = interleaveArrays(arr9, arr10);
        System.out.println(Arrays.toString(result5)); // [1, 2, 3, 5]
    }
}