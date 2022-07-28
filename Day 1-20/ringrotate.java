import java.util.*;

public class ringrotate {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt();
        int k = scn.nextInt();
        rotateshell(a, s, k);
        scn.close();

    }

    public static void rotateshell(int[][] a, int s, int k) {
        int[] oned = fillonedfromshell(a, s);
        rotate(oned, k);
        fillshellfromoned(a, oned, s);
    }

    public static int[] fillonedfromshell(int[][] a, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = a.length - s;
        int maxc = a[0].length - s;
        int sz = 2 * (maxr - minr + maxc - minc); // lw + bw + rw + lw - 4 (high - low + 1)
        int[] oned = new int[sz];

        // lw
        int idx = 0;
        for (int i = minr; i <= maxr; i++) {
            oned[idx] = a[i][minc];
            idx++;
        }

        // bw
        for (int i = minc + 1; i <= maxc; i++) {
            oned[idx] = a[maxr][i];
            idx++;
        }

        // rw
        for (int i = maxr + 1; i >= minr; i--) {
            oned[idx] = a[i][maxc];
            idx++;
        }

        // tw
        for (int i = maxc - 1; i >= minc + 1; i--) {
            oned[idx] = a[minr][i];
            idx++;
        }

        return oned;

    }

    public static void fillshellfromoned(int[][] a, int[] oned, int s) {

        int minr = s - 1;
        int minc = s - 1;
        int maxr = a.length - s;
        int maxc = a[0].length - s;

        // lw
        int idx = 0;
        for (int i = minr; i <= maxr; i++) {
            a[i][minc] = oned[idx];
            idx++;
        }

        // bw
        for (int i = minc + 1; i <= maxc; i++) {
            a[maxr][i] = oned[idx];
            idx++;
        }

        // rw
        for (int i = maxr + 1; i >= minr; i--) {
            a[i][maxc] = oned[idx];
            idx++;
        }

        // tw
        for (int i = maxc - 1; i >= minc + 1; i--) {
            a[minr][i] = oned[idx];
            idx++;
        }

    }

    public static void rotate(int[] oned, int k) {
        if (k > oned.length) {
            k = k % oned.length;
        }
        if (k < 0) {
            k = k + oned.length;
        }
        reverse(oned, 0, oned.length - k - 1);
        reverse(oned, oned.length - k, oned.length - 1);
        reverse(oned, 0, oned.length - 1);

    }

    public static void reverse(int[] oned, int s, int e) {
        int i = s;
        int j = e;
        while (i < j) {
            int temp = oned[i];
            oned[i] = oned[j];
            oned[j] = temp;

            i++;
            j--;
        }
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
