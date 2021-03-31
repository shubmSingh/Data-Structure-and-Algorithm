package Java;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    static boolean isAnagram(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 != n2)
            return false;
        char ch1[] = s1.toLowerCase().toCharArray();
        char ch2[] = s2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < n1; i++) {
            if (ch1[i] != ch2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        if (isAnagram(s1, s2))
            System.err.println("is Anagram");
        else
            System.out.println("is Not Anagram");
    }

}
