import java.util.*;

public class wavetraversal {

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

        for (int j = 0; j < n1; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < m1; i++) {
                    System.out.println(a1[i][j]);
                }
            } else {
                for (int i = m1 - 1; i >= 0; i--) {
                    System.out.println(a1[i][j]);
                }
            }
        }
        scn.close();
    }

}
