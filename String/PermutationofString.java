package Java.String;

public class PermutationofString {
    public String swap(String a, int i, int j) {
        char arr[] = a.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }

    void permute(String s, int l, int r) {
        if (l == r) {
            System.out.println(s);
        } else {
            for (int i = l; i <= r; i++) {
                s = swap(s, l, i);
                permute(s, l + 1, r);
                s = swap(s, l, i);
            }
        }

    }

    public static void main(String[] args) {
        PermutationofString ps = new PermutationofString();
        String s = "ABC";
        int n = s.length();
        ps.permute(s, 0, n - 1);

    }

}
