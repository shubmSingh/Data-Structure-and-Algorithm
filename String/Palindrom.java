package Java.String;

import javax.lang.model.util.ElementScanner6;

public class Palindrom {
    public boolean isPalindrom(String s) {
        char a[] = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j >= 0; j--) {
                if (a[i] == a[j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            Palindrom p = new Palindrom();
            String s = "gfgg";
            if (p.isPalindrom(s)) {
                System.out.println("is Palindrom");
            } else {
                System.out.println("is not palindrom");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
