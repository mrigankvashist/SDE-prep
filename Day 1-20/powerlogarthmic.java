import java.util.*;

public class powerlogarthmic {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(power(x, n));
        scn.close();
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int p = power(x, n / 2) * power(x, n / 2);
        if (n % 2 == 1) {
            p = p * x;
        }
        return p;
    }

}
