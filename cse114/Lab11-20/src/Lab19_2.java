// Tae Kim, CSE 114, Section1, Lab19_2, April 12, 2023
import java.util.Scanner;
import java.util.ArrayList;
public class Lab19_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The number of list 1: "); // 123 \n
        int list1Num = input.nextInt(); // \n
        System.out.print("The number of list 2: "); // \n
                                                    // 456 \n
        int list2Num = input.nextInt(); // \n

        ArrayList<String> list1 = new ArrayList<String>(list1Num);
        ArrayList<String> list2 = new ArrayList<String>(list2Num);

        input.nextLine();
        System.out.println("Enter " + list1Num + " cities: ");
        for (int i = 0; i < list1Num; i++) {
            list1.add(input.nextLine());
        }
        System.out.println("Enter " + list2Num + " cities: ");
        for (int j = 0; j < list2Num; j++) {
            list2.add(input.nextLine());
        }

        System.out.println(mergeList(list1, list2));
    }

    public static ArrayList<String> mergeList(ArrayList<String> lst1, ArrayList<String> lst2) {
        ArrayList<String> answer = new ArrayList<>();
        answer.addAll(lst1);
        answer.addAll(lst2);

        boolean done;
        do {
            done = false;
            for (int i = 0; i < answer.size() - 1; i++) {
                if (answer.get(i).compareTo(answer.get(i + 1)) > 0) {
                    String tempt = answer.get(i);
                    answer.set(i, answer.get(i + 1));
                    answer.set(i + 1, tempt);
                    done = true;
                }
            }
        } while(done);

        return answer;
    }
}
