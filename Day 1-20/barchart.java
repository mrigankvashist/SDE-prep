import java.util.*;

public class barchart {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        for (int floor = max; floor >= 1; floor--) {
            for (int i = 0; i < n; i++) {
                if (a[i] >= floor) {
                    System.out.print("*\t");
                } else
                    System.out.print("\t");
            }
            System.out.println();

            scn.close();
        }

    }

}
