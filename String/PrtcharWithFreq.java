package Java.String;

import java.util.HashMap;
import java.util.Map;

public class PrtcharWithFreq {
    public void countFreq(String s, int n) {
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        for (int i = 0; i < n; i++) {
            if (m.containsKey(s.charAt(i))) {
                m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
            } else {
                m.put(s.charAt(i), 1);
            }
        }
        for (Character c : m.keySet()) {
            System.err.print(c + " " + m.get(c));

        }

    }

    public static void main(String[] args) {
        PrtcharWithFreq pf = new PrtcharWithFreq();
        String s = "shubham singh";
        int n = s.length();
        pf.countFreq(s, n);

    }

}
