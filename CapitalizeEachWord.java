package Java;

import java.util.Scanner;

public class CapitalizeEachWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        // StringBuffer sb =new StringBuffer(s);
        // char ch[]=s.toCharArray();
        String words[] = s.split("\\s");
        String capital = "";
        for (String w : words) {
            String first = w.substring(0, 1);
            String remain = w.substring(1);
            capital += first.toUpperCase() + remain + " ";
        }
        System.out.println(capital);

    }

}
