package Java;

import java.util.*;
import java.util.Map;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        Map<Integer, String> t = new TreeMap<>();
        t.put(23, "hi");
        t.put(18, "value");
        System.out.println(t);
        System.out.println(t.keySet());
        System.out.println(t.containsKey(23));
        System.out.println(t.values());

    }

}
