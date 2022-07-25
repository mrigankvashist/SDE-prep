import java.util.*;

public class matrixmult {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int m1 = scn.nextInt();
        int n1 = scn.nextInt();
        int[][] a1 = new int[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                a1[i][j] = scn.nextInt();
            }
        }

        int m2 = scn.nextInt();
        int n2 = scn.nextInt();
        int[][] a2 = new int[m2][n2];
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                a2[i][j] = scn.nextInt();
            }
        }
        if (n1 != m2) {
            System.out.println("Invalid input");
            // return;
        }

        int[][] ans = new int[m1][n2];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n1; k++) {
                    ans[i][j] += a1[i][k] * a2[k][j];
                }
            }
        }

        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
            scn.close();

        }
    }

}