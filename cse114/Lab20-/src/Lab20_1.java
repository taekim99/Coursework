// Tae Kim, CSE 114, Section1, Lab20_1, April 19, 2023
import java.util.*;
public class Lab20_1 {
    public static void sort(ArrayList<Integer> list) {
        boolean isChanged = true;
        Integer temp;
        while (isChanged) {
            isChanged = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    isChanged = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five int numbers: ");
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(input.nextInt());
        }
        sort(arr);
        System.out.println(arr);
    }
}
