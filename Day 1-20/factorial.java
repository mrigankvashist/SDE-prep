import java.util.*;

public class factorial {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        System.out.println(factorials(t));
        scn.close();
    }

    public static int factorials(int n) {
        if (n == 0) {
            return 1;
        }
        int f = n * factorials(n - 1);
        return f;

    }

}
