package Java;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.util.Scanner;

public class StringPalindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        // char a[] = s.toCharArray();

        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        String rev = sb.toString();
        if (s.equals(rev)) {
            System.out.println("is palindrom : " + s);
        } else {
            System.out.println("is not Palindrom  : " + s);
        }
        // using two for loops
        // for (int i = 0; i <= s.length() - 1; i++)
        // {
        // for (int j = s.length() - 1; j >= 0; j++)
        // {
        // if (a[i] != a[j])
        // System.out.println("is not Palindrom");
        // else
        // System.out.println("is palindrom");
        // }
        // }
        in.close();
    }

}
