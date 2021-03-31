package SDEProblem.Day4Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class TwoSumHashing {
    public static void twosum(int arr[], int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int target = k - arr[i];
            if (m.containsKey(target)) {
                System.out.println(m.get(target) + " " + i);
            }
            m.put(arr[i], i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 6, 8, 7, 3, -5, 4, 0 };
        int k = 6;
        twosum(arr, k);
    }
}
