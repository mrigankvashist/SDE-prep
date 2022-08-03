import java.util.*;

public class permutationsofstring {

    public static void solution(String str) {
        // write your code here

        int n = str.length();
        int f = fact(n);

        for (int i = 0; i < f; i++) {
            int temp = i;
            StringBuilder sb = new StringBuilder(str);

            for (int div = n; div >= 1; div--) {
                int q = temp / div;
                int r = temp % div;

                System.out.print(sb.charAt(r));
                temp = q;
                sb.deleteCharAt(r);
            }
            System.out.println();
        }

    }

    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
        scn.close();
    }

}
