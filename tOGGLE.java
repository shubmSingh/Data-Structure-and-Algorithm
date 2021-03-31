package Java;

import java.util.Scanner;

public class tOGGLE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String word[] = s.split("\\s");
        String wd = " ";
        for (String w : word) {
            String first = w.substring(0, 1);
            String remain = w.substring(1);
            wd += first + remain.toUpperCase() + " ";

        }
        System.out.println(wd);
    }

}
