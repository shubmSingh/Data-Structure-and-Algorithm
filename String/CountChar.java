package Java.String;

public class CountChar {
    public int count(String s, int n, char c) {
        char ch[] = s.toCharArray();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c)
                cnt++;

        }
        return cnt;

    }

    public static void main(String[] args) {
        String s = "aasdfghaafdsasa";
        int n = s.length();
        char ch = 'a';
        CountChar c = new CountChar();
        int res = c.count(s, n, ch);
        System.out.println(res);

    }

}
