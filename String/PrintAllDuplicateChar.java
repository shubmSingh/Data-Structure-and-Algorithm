package Java.String;

import java.util.HashMap;
import java.util.Map;

public class PrintAllDuplicateChar {
    public static void dpChar(String s) {
        char ch[] = s.toCharArray();
        Map<Character, Integer> mp = new HashMap<Character, Integer>();
        for (char c : ch) {
            if (mp.containsKey(c)) {
                mp.put(c, mp.get(c) + 1);
            } else {
                mp.put(c, 1);
            }

        }
        for (Map.Entry<Character, Integer> e : mp.entrySet()) {
            if (e.getValue() > 1)
                System.out.println(e.getKey());

        }

    }

    public static void main(String[] args) {
        String s = "abcdefghijkad";
        dpChar(s);
    }

}
