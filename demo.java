import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class demo {
    public static void main(String[] args) {
        try {
            BufferedReader inputObject = new BufferedReader(new InputStreamReader(System.in));
            String s = inputObject.readLine();
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i), map.containsKey(s.charAt(i)) ? map.get(s.charAt(i)) + 1 : 1);
            }
            for (Character c : map.keySet()) {
                System.out.println(c + " " + map.get(c));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
