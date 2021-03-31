package SDEProblem.Day4Hashing;

import java.util.*;

public class TwoSum {
    public static void twosum(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == k - arr[i]) {
                    System.out.println(i + " + " + j + "=" + k);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, -3, 7, 10, 6, 8 };
        int k = 17;
        int n = arr.length;
        twosum(arr, k);
    }

}
