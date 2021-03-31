package Java;

import java.util.*;

public class LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(50, "shubham");
        map.put(51, "anand");
        map.put(52, "Raj");
        map.put(55, "aditya");
        map.put(20, "jain");
        // for (Map.Entry<String, Integer> e : m.keySet()) {
        // System.out.println(e.getKey() + " " + e.getValue());

        // }
        // for (Integer s : m.keySet()) {
        // String val = m.get(s);
        // System.out.println(val);

        // }
        System.out.println(map.KeySet());
    }

}
