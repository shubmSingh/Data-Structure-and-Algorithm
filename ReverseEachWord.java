package Java;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String str[] = s.split("\\s");
        String rev = "";
        for (String w : str) {
            StringBuffer sb = new StringBuffer(w);
            rev += sb.reverse() + " ";
        }
        System.out.println(rev);

    }

}
