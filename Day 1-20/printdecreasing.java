import java.util.*;

public class printdecreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        printDecreasing(t);
        scn.close();
    }

    public static void printDecreasing(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        printDecreasing(n - 1);

    }

}
