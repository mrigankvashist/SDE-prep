import java.util.*;

public class anybasetoany {

    // first we convert anybase to decimal, then decimal to anybase

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int s = scn.nextInt(); // source base
        int d = scn.nextInt(); // destination base

        // source base to decimal
        int rv1 = 0;
        int m1 = 1;
        while (n > 0) {
            int d2 = n % 10;
            n = n / 10;
            rv1 += d2 * m1;
            m1 = m1 * s;
        }

        // decimal base to destination base
        int rv2 = 0;
        int m2 = 1;
        while (rv1 > 0) {
            int d1 = rv1 % d;
            rv1 = rv1 / d;
            rv2 += d1 * m2;
            m2 = m2 * 10;
        }
        System.out.print(rv2);
        scn.close();

    }
}