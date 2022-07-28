import java.util.*;

public class spiraldisplay {

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

        int tne = m1 * n1;
        int cnt = 0;
        int minr = 0;
        int minc = 0;
        int maxr = m1 - 1;
        int maxc = n1 - 1;
        while (cnt < tne) {
            for (int i = minr; i <= maxr && cnt < tne; i++) {
                System.out.println(a1[i][minc]);
                cnt++;
            }
            minc++;

            for (int i = minc; i <= maxc && cnt < tne; i++) {
                System.out.println(a1[maxr][i]);
                cnt++;
            }
            maxr--;

            for (int i = maxr; i >= minr && cnt < tne; i--) {
                System.out.println(a1[i][maxc]);
                cnt++;
            }
            maxc--;

            for (int i = maxc; i >= minc && cnt < tne; i--) {
                System.out.println(a1[minr][i]);
                cnt++;
            }
            minr++;
        }
        scn.close();
    }

}