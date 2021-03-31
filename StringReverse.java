package Java;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        // By reverse Iteration
        // char ch[] = s.toCharArray();
        // String rev = "";
        // for (int i = s.length() - 1; i > 0; i--) {
        // rev = rev + ch[i];
        // }
        // System.out.println(rev);
        // Using String Builder
        // StringBuilder sb = new StringBuilder(s);
        // System.out.println(sb.reverse());
        // Using string Buffer
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);

    }

}