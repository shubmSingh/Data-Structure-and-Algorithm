package Java;

import java.util.Scanner;

public class MaxSumSubArray {
    public static int maxsumsubarray(int a[]) {
        int n = a.length;
        int sum = a[0];
        int maxsum = a[0];
        for (int i = 1; i < n; i++) {
            sum = Math.max(a[i], sum + a[i]);
            maxsum = Math.max(sum, maxsum);
        }
        return maxsum;

    }

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        int a[] = { 4, -3, -5, 1, 7, -1, 1 };
        // int mx = maxsumsubarray(a);
        System.out.println("Maximum sum of Contiguous sum of sub array is :" + maxsumsubarray(a));
    }

}
