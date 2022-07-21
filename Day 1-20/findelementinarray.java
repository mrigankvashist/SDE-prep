import java.util.*;

public class findelementinarray {

    public static void main(String[] args) throws Exception {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scn.nextInt();
            }
            int d = scn.nextInt();

            for (int i = 0; i < n; i++) {
                if (a[i] == d) {
                    System.out.print(i);
                    return;
                }
            }
            System.out.print(-1);
            scn.close();
        }

    }

}