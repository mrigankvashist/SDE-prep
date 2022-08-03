import java.util.*;

public class printincreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        printIncreasing(t);
        scn.close();
    }

    public static void printIncreasing(int n) {

        if (n == 0) {
            return;
        }

        printIncreasing(n - 1);
        System.out.println(n);

    }

}
