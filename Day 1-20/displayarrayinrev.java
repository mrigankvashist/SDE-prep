import java.util.*;

public class displayarrayinrev {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        displayArrReverse(a, n - 1);
        scn.close();
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if (idx == -1) {
            return;
        }

        System.out.println(arr[idx]);
        displayArrReverse(arr, idx - 1);

    }

}