package Java;

import java.security.KeyStore.Entry;
import java.util.*;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<String, String>();
        m.put("52", "shub");
        m.put("50", "raj");
        m.put("19", "jitt");
        m.put("20", "adit");

        for (Map.Entry<String, String> e : m.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());

        }
    }
}
