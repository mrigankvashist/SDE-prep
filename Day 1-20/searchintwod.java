import java.util.*;

public class searchintwod {

    public static void main(String[] args) throws Exception {
        // write your code here

        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = scn.nextInt();
                }
            }

            int x = scn.nextInt();

            // for (int i = 0; i < n; i++) {
            // for (int j = 0; j < n; j++) {
            // if (x == a[i][j]) {
            // System.out.println(i);
            // System.out.println(j);
            // return;
            // }
            // }
            // }
            // System.out.println("Not Found");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (x == a[i][j]) {
                        System.out.println(i);
                        System.out.println(j);
                        return;
                    }
                }
            }
            System.out.println("Not Found");

            scn.close();
        }

    }

}