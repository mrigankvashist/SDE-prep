import java.util.*;

public class firstandlastindex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        int s = 0;
        int e = n - 1;
        int fi = -1;
        int li = -1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (k > a[m]) {
                s = m + 1;
            } else if (k < a[m]) {
                e = m - 1;
            } else {
                fi = m;
                e = m - 1;
            }
        }
        System.out.println(fi);

        s = 0;
        e = n - 1;
        fi = -1;
        li = -1;

        while (s <= e) {
            int m = (s + e) / 2;
            if (k > a[m]) {
                s = m + 1;
            } else if (k < a[m]) {
                e = m - 1;
            } else {
                li = m;
                s = m + 1;
            }
        }
        System.out.println(li);
        scn.close();

    }

}