import java.util.*;

public class lastindex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        int x = scn.nextInt();

        System.out.println(lastIndex(a, n - 1, x));
        scn.close();
    }

    public static int lastIndex(int[] arr, int idx, int x) {
        if (idx == -1) {
            return -1;
        }

        if (arr[idx] == x) {
            return idx;
        } else {
            int slidx = lastIndex(arr, idx - 1, x);
            return slidx;
        }

    }

}
