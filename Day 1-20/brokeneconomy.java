import java.util.*;

public class brokeneconomy {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        int start = 0;
        int end = a.length - 1;
        // System.out.println(end+ " , "+start);
        // System.out.println(k);

        while (start <= end) {
            int mid = (start + end) / 2;

            if (k == a[mid]) {
                System.out.print(a[mid]);
                break;
            } else if (k > a[mid]) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        if (start > end) {
            System.out.println(a[start]);
            System.out.println(a[end]);
        }
        scn.close();
    }

}
