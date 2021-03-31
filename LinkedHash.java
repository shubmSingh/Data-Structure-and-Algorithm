package Java;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHash {
    public static void main(String[] args) {
        Map<Integer, String> m = new LinkedHashMap<Integer, String>();
        m.put(50, "shubham");
        m.put(51, "anand");
        m.put(52, "Raj");
        m.put(55, "aditya");
        m.put(20, "jain");
        System.out.println(m);
        System.out.println(m.keySet());
        System.out.println(m.values());
        for (Map.Entry<Integer, String> e : m.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());

        }
        // for (Integer s : m.keySet()) {
        // String val = m.get(s;
        // System.out.println(val);
        // }
        // for (String s : m.entrySet()) {
        // System.out.println(m.get(s));

        // }
    }

}
