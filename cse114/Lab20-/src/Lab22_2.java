// Tae Kim, CSE 114, Section1, Lab22_2, April 26, 2023
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
public class Lab22_2 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        try {
            File f = new File("CSE114\\Lab20-\\src\\cities.txt");
            Scanner input = new Scanner(f);
            while (input.hasNext()) {
                arr.add(input.nextLine());
            }

            FileWriter fw = new FileWriter("CSE114\\Lab20-\\src\\output.txt", false);
            PrintWriter pw = new PrintWriter(fw);

            for(int i = arr.size()-1; i >= 0; i--) {
                pw.println(arr.get(i));
            }

            pw.flush();
        } catch (IOException ex) {
            System.out.println(ex);
        }
//        try {
//            File f2 = new File("CSE114\\Lab20-\\src\\output.txt");
//            Scanner input = new Scanner(f2);
//            while (input.hasNext()) {
//                for (int i = arr.size() - 1; i >= 0; i--) {
//                    arr.add(input.nextLine());
//                }
//            }
//        } catch (IOException ex) {
//            System.out.println(ex);
//        }

        System.out.println(arr);
    }
}
