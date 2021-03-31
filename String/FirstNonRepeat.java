package Java.String;

import java.util.HashMap;

public class FirstNonRepeat {
    public static int unique(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (hm.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;

    }

    public static void main(String[] args) {
        String s = "sshubham";
        System.out.println(unique(s));

    }

}
