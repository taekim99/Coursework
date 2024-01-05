// Tae Kim, CSE 114, Section1, Lab12_1, Mar 20, 2023
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        double[] values = {6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};

        bubbleSort(values);
    }

    public static void bubbleSort(double[] list) {
        boolean changed;
        do {
            changed = false;
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    double tempt = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tempt;
                    changed = true;
                }
            }
        } while (changed);

        System.out.println(Arrays.toString(list));
    }
}
