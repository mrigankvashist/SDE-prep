import java.util.*;

public class saddleprice {

    public static void main(String[] args) throws Exception {
        try (// write your code here
                Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = scn.nextInt();
                }
            }

            for (int i = 0; i < a.length; i++) {
                int svc = 0;
                for (int j = 1; j < a[0].length; j++) {
                    if (a[i][svc] > a[i][j]) {
                        svc = j;
                    }
                }

                boolean flag = true;

                for (int k = 0; k < a.length; k++) {
                    if (a[k][svc] > a[i][svc]) {
                        flag = false;
                        break;
                    }
                }

                if (flag == true) {
                    System.out.println(a[i][svc]);
                    return;
                }
            }
            System.out.println("Invalid input");
            scn.close();
        }

    }

}
