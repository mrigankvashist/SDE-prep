import java.util.*;

public class printincreasingdecreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        pdi(t);
        scn.close();
    }

    public static void pdi(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);
        pdi(n - 1);
        System.out.println(n);

    }

}